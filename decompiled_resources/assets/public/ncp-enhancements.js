/* ============================================================
 * Note Counter Pro - Custom Enhancements
 * Features: UPI QR Code | CSV Export | Rate Us / Share App
 * Injected via index.html, runs after the main app loads
 * ============================================================ */
(function () {
  'use strict';

  const APP_CONFIG = {
    packageName: 'com.lokhnathtechnical.notecounterpro',
    playStoreUrl: 'https://play.google.com/store/apps/details?id=com.lokhnathtechnical.notecounterpro',
    appName: 'Note Counter Pro',
    version: '2.8.1',
    accentColor: '#fbbf24',
    bgColor: '#1a1a2e',
    rateUsDelayDays: 7,        // Show rate us prompt after 7 days of usage
    rateUsKey: 'ncp_rate_us_shown'
  };

  /* ============================================================
   * WAIT FOR APP TO LOAD
   * ============================================================ */
  function whenReady(callback) {
    if (document.readyState === 'complete') {
      setTimeout(callback, 1500);
    } else {
      window.addEventListener('load', function () {
        setTimeout(callback, 1500);
      });
    }
  }

  /* ============================================================
   * FEATURE C: UPI QR CODE GENERATOR + PAYMENT MODAL
   * ============================================================ */
  const UPI_DEFAULTS = JSON.parse(localStorage.getItem('ncp_upi_settings') || '{}');

  function openUpiQrModal() {
    // Remove existing modal
    const existing = document.getElementById('ncp-upi-modal');
    if (existing) existing.remove();

    const modal = document.createElement('div');
    modal.id = 'ncp-upi-modal';
    modal.style.cssText = `
      position:fixed;inset:0;background:rgba(0,0,0,0.85);z-index:99999;
      display:flex;align-items:center;justify-content:center;padding:16px;
      font-family:-apple-system,BlinkMacSystemFont,'Segoe UI',Roboto,sans-serif;
    `;

    modal.innerHTML = `
      <div style="background:#1a1a2e;color:#fff;border-radius:16px;padding:24px;max-width:340px;width:100%;box-shadow:0 20px 60px rgba(0,0,0,0.5);border:1px solid #fbbf24;">
        <div style="display:flex;justify-content:space-between;align-items:center;margin-bottom:16px;">
          <h2 style="margin:0;font-size:18px;color:#fbbf24;">UPI Payment QR</h2>
          <button id="ncp-upi-close" style="background:none;border:none;color:#fff;font-size:24px;cursor:pointer;line-height:1;">&times;</button>
        </div>

        <label style="display:block;font-size:13px;color:#9ca3af;margin-bottom:4px;">Your UPI ID</label>
        <input id="ncp-upi-id" type="text" placeholder="yourname@upi" value="${UPI_DEFAULTS.upiId || ''}" style="width:100%;padding:10px;background:#0a0a1a;border:1px solid #374151;border-radius:8px;color:#fff;font-size:14px;margin-bottom:12px;box-sizing:border-box;">

        <label style="display:block;font-size:13px;color:#9ca3af;margin-bottom:4px;">Payee Name</label>
        <input id="ncp-upi-name" type="text" placeholder="Your Name" value="${UPI_DEFAULTS.payeeName || ''}" style="width:100%;padding:10px;background:#0a0a1a;border:1px solid #374151;border-radius:8px;color:#fff;font-size:14px;margin-bottom:12px;box-sizing:border-box;">

        <label style="display:block;font-size:13px;color:#9ca3af;margin-bottom:4px;">Amount (₹)</label>
        <input id="ncp-upi-amount" type="number" placeholder="0" min="0" step="0.01" style="width:100%;padding:10px;background:#0a0a1a;border:1px solid #374151;border-radius:8px;color:#fff;font-size:14px;margin-bottom:12px;box-sizing:border-box;">

        <label style="display:block;font-size:13px;color:#9ca3af;margin-bottom:4px;">Note (optional)</label>
        <input id="ncp-upi-note" type="text" placeholder="Payment note" style="width:100%;padding:10px;background:#0a0a1a;border:1px solid #374151;border-radius:8px;color:#fff;font-size:14px;margin-bottom:16px;box-sizing:border-box;">

        <button id="ncp-upi-generate" style="width:100%;padding:12px;background:#fbbf24;color:#1a1a2e;border:none;border-radius:8px;font-weight:600;font-size:15px;cursor:pointer;margin-bottom:16px;">Generate QR Code</button>

        <div id="ncp-upi-qr-result" style="display:none;text-align:center;">
          <div id="ncp-upi-qr-image" style="background:#fff;padding:12px;border-radius:8px;display:inline-block;margin-bottom:12px;"></div>
          <p id="ncp-upi-amount-display" style="color:#fbbf24;font-size:20px;font-weight:600;margin:8px 0;"></p>
          <p id="ncp-upi-name-display" style="color:#9ca3af;font-size:14px;margin:4px 0;"></p>
          <button id="ncp-upi-share" style="width:100%;padding:10px;background:#10b981;color:#fff;border:none;border-radius:8px;font-weight:600;font-size:14px;cursor:pointer;margin-top:8px;">Share QR</button>
          <button id="ncp-upi-pay-now" style="width:100%;padding:10px;background:#3b82f6;color:#fff;border:none;border-radius:8px;font-weight:600;font-size:14px;cursor:pointer;margin-top:8px;">Open in UPI App</button>
        </div>
      </div>
    `;

    document.body.appendChild(modal);

    const closeBtn = modal.querySelector('#ncp-upi-close');
    closeBtn.onclick = () => modal.remove();
    modal.onclick = (e) => { if (e.target === modal) modal.remove(); };

    const generateBtn = modal.querySelector('#ncp-upi-generate');
    generateBtn.onclick = () => {
      const upiId = modal.querySelector('#ncp-upi-id').value.trim();
      const payeeName = modal.querySelector('#ncp-upi-name').value.trim();
      const amount = modal.querySelector('#ncp-upi-amount').value;
      const note = modal.querySelector('#ncp-upi-note').value.trim();

      if (!upiId || !upiId.includes('@')) {
        alert('Please enter a valid UPI ID (e.g. yourname@upi)');
        return;
      }

      // Save settings for next time
      localStorage.setItem('ncp_upi_settings', JSON.stringify({
        upiId: upiId,
        payeeName: payeeName
      }));

      // Build UPI deep link
      let upiUrl = `upi://pay?pa=${encodeURIComponent(upiId)}`;
      if (payeeName) upiUrl += `&pn=${encodeURIComponent(payeeName)}`;
      if (amount && parseFloat(amount) > 0) upiUrl += `&am=${encodeURIComponent(amount)}`;
      if (note) upiUrl += `&tn=${encodeURIComponent(note)}`;
      upiUrl += '&cu=INR';

      // Generate QR using api.qrserver.com (public, free, no API key)
      const qrImageUrl = `https://api.qrserver.com/v1/create-qr-code/?size=240x240&data=${encodeURIComponent(upiUrl)}`;

      const result = modal.querySelector('#ncp-upi-qr-result');
      const qrImage = modal.querySelector('#ncp-upi-qr-image');
      const amountDisplay = modal.querySelector('#ncp-upi-amount-display');
      const nameDisplay = modal.querySelector('#ncp-upi-name-display');

      qrImage.innerHTML = `<img src="${qrImageUrl}" alt="UPI QR" style="display:block;width:216px;height:216px;">`;
      amountDisplay.textContent = amount && parseFloat(amount) > 0 ? `₹ ${parseFloat(amount).toFixed(2)}` : '';
      nameDisplay.textContent = payeeName || upiId;

      result.style.display = 'block';
      generateBtn.style.display = 'none';

      // Share button
      modal.querySelector('#ncp-upi-share').onclick = async () => {
        if (navigator.share) {
          try {
            // Try to fetch image as blob for sharing
            const response = await fetch(qrImageUrl);
            const blob = await response.blob();
            const file = new File([blob], 'upi-qr.png', { type: 'image/png' });
            if (navigator.canShare && navigator.canShare({ files: [file] })) {
              await navigator.share({
                title: 'Payment QR',
                text: `${payeeName ? payeeName + ' - ' : ''}${amount ? '₹' + amount + ' - ' : ''}Scan to pay via UPI`,
                files: [file]
              });
              return;
            }
          } catch (e) {
            console.warn('File share failed, falling back to URL share', e);
          }
          await navigator.share({
            title: 'Payment QR',
            text: `Pay me via UPI: ${upiUrl}`
          });
        } else {
          // Fallback: open WhatsApp share
          const shareText = encodeURIComponent(`Pay me via UPI:\n${upiUrl}`);
          window.open(`https://wa.me/?text=${shareText}`, '_blank');
        }
      };

      // Pay now button - opens UPI app directly
      modal.querySelector('#ncp-upi-pay-now').onclick = () => {
        window.location.href = upiUrl;
      };
    };
  }

  /* ============================================================
   * FEATURE D: CSV EXPORT FOR ENTRIES/CUSTOMERS
   * ============================================================ */
  function escapeCsv(value) {
    if (value === null || value === undefined) return '';
    const str = String(value);
    if (str.includes(',') || str.includes('"') || str.includes('\n')) {
      return '"' + str.replace(/"/g, '""') + '"';
    }
    return str;
  }

  function downloadFile(content, filename, mimeType) {
    const blob = new Blob([content], { type: mimeType });
    const url = URL.createObjectURL(blob);
    const a = document.createElement('a');
    a.href = url;
    a.download = filename;
    document.body.appendChild(a);
    a.click();
    document.body.removeChild(a);
    setTimeout(() => URL.revokeObjectURL(url), 1000);
  }

  function exportEntriesAsCsv() {
    let entries = [];
    try {
      entries = JSON.parse(localStorage.getItem('note_counter_entries') || '[]');
      if (!Array.isArray(entries)) entries = [];
    } catch (e) { entries = []; }

    if (entries.length === 0) {
      alert('No entries found to export. Add some entries first!');
      return;
    }

    // Detect entry shape (try common fields)
    const sample = entries[0] || {};
    const possibleKeys = Object.keys(sample);

    // Prefer these columns if available
    const preferredColumns = ['id', 'date', 'type', 'amount', 'currency', 'customer', 'customerName', 'notes', 'note', 'description', 'category', 'mode', 'createdAt', 'timestamp'];
    const columns = preferredColumns.filter(c => possibleKeys.includes(c));
    // Add any remaining keys we didn't anticipate
    possibleKeys.forEach(k => { if (!columns.includes(k)) columns.push(k); });

    const header = columns.join(',');
    const rows = entries.map(entry => {
      return columns.map(col => escapeCsv(entry[col])).join(',');
    });

    const csv = [header, ...rows].join('\n');
    const dateStr = new Date().toISOString().slice(0, 10);
    downloadFile('\ufeff' + csv, `note-counter-entries-${dateStr}.csv`, 'text/csv;charset=utf-8');
  }

  function exportCustomersAsCsv() {
    let customers = [];
    try {
      customers = JSON.parse(localStorage.getItem('note_counter_customers') || '[]');
      if (!Array.isArray(customers)) customers = [];
    } catch (e) { customers = []; }

    if (customers.length === 0) {
      alert('No customers found to export. Add some customers first!');
      return;
    }

    const sample = customers[0] || {};
    const possibleKeys = Object.keys(sample);
    const preferredColumns = ['id', 'name', 'customerName', 'phone', 'email', 'address', 'balance', 'totalCredit', 'totalDebit', 'notes', 'createdAt'];
    const columns = preferredColumns.filter(c => possibleKeys.includes(c));
    possibleKeys.forEach(k => { if (!columns.includes(k)) columns.push(k); });

    const header = columns.join(',');
    const rows = customers.map(c => columns.map(col => escapeCsv(c[col])).join(','));
    const csv = [header, ...rows].join('\n');
    const dateStr = new Date().toISOString().slice(0, 10);
    downloadFile('\ufeff' + csv, `note-counter-customers-${dateStr}.csv`, 'text/csv;charset=utf-8');
  }

  function openExportModal() {
    const existing = document.getElementById('ncp-export-modal');
    if (existing) existing.remove();

    const modal = document.createElement('div');
    modal.id = 'ncp-export-modal';
    modal.style.cssText = `
      position:fixed;inset:0;background:rgba(0,0,0,0.85);z-index:99999;
      display:flex;align-items:center;justify-content:center;padding:16px;
      font-family:-apple-system,BlinkMacSystemFont,'Segoe UI',Roboto,sans-serif;
    `;
    modal.innerHTML = `
      <div style="background:#1a1a2e;color:#fff;border-radius:16px;padding:24px;max-width:340px;width:100%;box-shadow:0 20px 60px rgba(0,0,0,0.5);border:1px solid #fbbf24;">
        <div style="display:flex;justify-content:space-between;align-items:center;margin-bottom:16px;">
          <h2 style="margin:0;font-size:18px;color:#fbbf24;">Export Data (CSV)</h2>
          <button id="ncp-export-close" style="background:none;border:none;color:#fff;font-size:24px;cursor:pointer;line-height:1;">&times;</button>
        </div>
        <p style="color:#9ca3af;font-size:13px;margin:0 0 16px 0;">Export your data in CSV format (opens in Excel/Sheets)</p>

        <button id="ncp-export-entries" style="width:100%;padding:12px;background:#fbbf24;color:#1a1a2e;border:none;border-radius:8px;font-weight:600;font-size:15px;cursor:pointer;margin-bottom:8px;display:flex;align-items:center;gap:8px;justify-content:center;">
          <span>📋</span> Export Entries CSV
        </button>
        <button id="ncp-export-customers" style="width:100%;padding:12px;background:#10b981;color:#fff;border:none;border-radius:8px;font-weight:600;font-size:15px;cursor:pointer;margin-bottom:8px;display:flex;align-items:center;gap:8px;justify-content:center;">
          <span>👥</span> Export Customers CSV
        </button>
        <button id="ncp-export-both" style="width:100%;padding:12px;background:#3b82f6;color:#fff;border:none;border-radius:8px;font-weight:600;font-size:15px;cursor:pointer;display:flex;align-items:center;gap:8px;justify-content:center;">
          <span>📦</span> Export Both
        </button>
      </div>
    `;
    document.body.appendChild(modal);

    modal.querySelector('#ncp-export-close').onclick = () => modal.remove();
    modal.onclick = (e) => { if (e.target === modal) modal.remove(); };

    modal.querySelector('#ncp-export-entries').onclick = exportEntriesAsCsv;
    modal.querySelector('#ncp-export-customers').onclick = exportCustomersAsCsv;
    modal.querySelector('#ncp-export-both').onclick = () => {
      exportEntriesAsCsv();
      setTimeout(exportCustomersAsCsv, 800);
    };
  }

  /* ============================================================
   * FEATURE E: RATE US + SHARE APP
   * ============================================================ */
  function openRateShareModal() {
    const existing = document.getElementById('ncp-rateshare-modal');
    if (existing) existing.remove();

    const modal = document.createElement('div');
    modal.id = 'ncp-rateshare-modal';
    modal.style.cssText = `
      position:fixed;inset:0;background:rgba(0,0,0,0.85);z-index:99999;
      display:flex;align-items:center;justify-content:center;padding:16px;
      font-family:-apple-system,BlinkMacSystemFont,'Segoe UI',Roboto,sans-serif;
    `;
    modal.innerHTML = `
      <div style="background:#1a1a2e;color:#fff;border-radius:16px;padding:24px;max-width:340px;width:100%;box-shadow:0 20px 60px rgba(0,0,0,0.5);border:1px solid #fbbf24;text-align:center;">
        <div style="display:flex;justify-content:space-between;align-items:center;margin-bottom:16px;">
          <h2 style="margin:0;font-size:18px;color:#fbbf24;">Enjoying Note Counter Pro?</h2>
          <button id="ncp-rateshare-close" style="background:none;border:none;color:#fff;font-size:24px;cursor:pointer;line-height:1;">&times;</button>
        </div>

        <div style="font-size:48px;margin:8px 0 16px 0;">⭐⭐⭐⭐⭐</div>
        <p style="color:#d1d5db;font-size:14px;line-height:1.5;margin:0 0 20px 0;">Your feedback helps us improve and reach more users. Please take a moment to rate us!</p>

        <button id="ncp-rate-now" style="width:100%;padding:12px;background:#fbbf24;color:#1a1a2e;border:none;border-radius:8px;font-weight:600;font-size:15px;cursor:pointer;margin-bottom:8px;display:flex;align-items:center;gap:8px;justify-content:center;">
          <span>⭐</span> Rate on Play Store
        </button>
        <button id="ncp-share-now" style="width:100%;padding:12px;background:#10b981;color:#fff;border:none;border-radius:8px;font-weight:600;font-size:15px;cursor:pointer;margin-bottom:8px;display:flex;align-items:center;gap:8px;justify-content:center;">
          <span>📤</span> Share with Friends
        </button>
        <button id="ncp-feedback" style="width:100%;padding:12px;background:#374151;color:#fff;border:none;border-radius:8px;font-weight:600;font-size:15px;cursor:pointer;display:flex;align-items:center;gap:8px;justify-content:center;">
          <span>💬</span> Send Feedback
        </button>
      </div>
    `;
    document.body.appendChild(modal);

    modal.querySelector('#ncp-rateshare-close').onclick = () => modal.remove();
    modal.onclick = (e) => { if (e.target === modal) modal.remove(); };

    modal.querySelector('#ncp-rate-now').onclick = () => {
      localStorage.setItem(APP_CONFIG.rateUsKey, new Date().toISOString());
      window.open(APP_CONFIG.playStoreUrl, '_blank');
      modal.remove();
    };

    modal.querySelector('#ncp-share-now').onclick = async () => {
      const shareText = `💵 Note Counter Pro - Free Cash Counter App!\n\nCount any cash in seconds with multi-currency support, PDF reports, and Google Drive backup.\n\nDownload now:\n${APP_CONFIG.playStoreUrl}`;
      if (navigator.share) {
        try {
          await navigator.share({
            title: 'Note Counter Pro',
            text: shareText,
            url: APP_CONFIG.playStoreUrl
          });
        } catch (e) {
          // User cancelled - ignore
        }
      } else {
        const whatsappText = encodeURIComponent(shareText);
        window.open(`https://wa.me/?text=${whatsappText}`, '_blank');
      }
    };

    modal.querySelector('#ncp-feedback').onclick = () => {
      window.location.href = 'mailto:lokhnathtechnical43@gmail.com?subject=Note%20Counter%20Pro%20Feedback&body=Hi%2C%0A%0AI%20have%20feedback%20about%20Note%20Counter%20Pro%3A%0A%0A';
      modal.remove();
    };
  }

  /* ============================================================
   * FLOATING ACTION BUTTON (FAB) MENU
   * ============================================================ */
  function createFab() {
    if (document.getElementById('ncp-fab-container')) return;

    const container = document.createElement('div');
    container.id = 'ncp-fab-container';
    container.style.cssText = `
      position:fixed;bottom:80px;right:16px;z-index:99998;
      font-family:-apple-system,BlinkMacSystemFont,'Segoe UI',Roboto,sans-serif;
    `;

    // Main FAB
    const fab = document.createElement('button');
    fab.id = 'ncp-fab-main';
    fab.style.cssText = `
      width:56px;height:56px;border-radius:50%;
      background:linear-gradient(135deg,#fbbf24,#f59e0b);
      color:#1a1a2e;border:none;cursor:pointer;
      box-shadow:0 4px 12px rgba(0,0,0,0.4);
      display:flex;align-items:center;justify-content:center;
      font-size:24px;font-weight:bold;transition:transform 0.2s;
    `;
    fab.innerHTML = '+';
    fab.title = 'Quick Actions';

    // Menu items (initially hidden)
    const menu = document.createElement('div');
    menu.id = 'ncp-fab-menu';
    menu.style.cssText = `
      position:absolute;bottom:64px;right:0;
      display:none;flex-direction:column;gap:8px;
    `;

    const menuItems = [
      { id: 'upi', icon: '💳', label: 'UPI QR', action: openUpiQrModal, color: '#3b82f6' },
      { id: 'csv', icon: '📊', label: 'Export CSV', action: openExportModal, color: '#10b981' },
      { id: 'rate', icon: '⭐', label: 'Rate Us', action: openRateShareModal, color: '#fbbf24' }
    ];

    menuItems.forEach((item, idx) => {
      const btn = document.createElement('button');
      btn.style.cssText = `
        display:flex;align-items:center;gap:8px;
        padding:10px 16px;border-radius:24px;
        background:${item.color};color:#fff;border:none;cursor:pointer;
        font-size:13px;font-weight:600;
        box-shadow:0 2px 8px rgba(0,0,0,0.3);
        white-space:nowrap;
        opacity:0;transform:translateY(10px);transition:all 0.2s;
        transition-delay:${idx * 50}ms;
      `;
      btn.innerHTML = `<span style="font-size:16px;">${item.icon}</span> ${item.label}`;
      btn.onclick = () => {
        item.action();
        toggleMenu(false);
      };
      menu.appendChild(btn);
    });

    container.appendChild(menu);
    container.appendChild(fab);
    document.body.appendChild(container);

    let menuOpen = false;
    function toggleMenu(open) {
      menuOpen = (open === undefined) ? !menuOpen : open;
      if (menuOpen) {
        menu.style.display = 'flex';
        fab.style.transform = 'rotate(45deg)';
        // Animate items in
        setTimeout(() => {
          menu.querySelectorAll('button').forEach(b => {
            b.style.opacity = '1';
            b.style.transform = 'translateY(0)';
          });
        }, 10);
      } else {
        fab.style.transform = 'rotate(0deg)';
        menu.querySelectorAll('button').forEach(b => {
          b.style.opacity = '0';
          b.style.transform = 'translateY(10px)';
        });
        setTimeout(() => { menu.style.display = 'none'; }, 200);
      }
    }

    fab.onclick = (e) => {
      e.stopPropagation();
      toggleMenu();
    };

    // Close menu on outside click
    document.addEventListener('click', (e) => {
      if (menuOpen && !container.contains(e.target)) {
        toggleMenu(false);
      }
    });
  }

  /* ============================================================
   * AUTO-POPUP RATE US PROMPT (after X days of usage)
   * ============================================================ */
  function maybeShowRateUsPrompt() {
    const lastShown = localStorage.getItem(APP_CONFIG.rateUsKey);
    if (lastShown) return; // Already shown/rated

    const firstUse = localStorage.getItem('ncp_first_use');
    if (!firstUse) {
      localStorage.setItem('ncp_first_use', new Date().toISOString());
      return;
    }

    const daysSinceFirstUse = (Date.now() - new Date(firstUse).getTime()) / (1000 * 60 * 60 * 24);
    if (daysSinceFirstUse >= APP_CONFIG.rateUsDelayDays) {
      setTimeout(() => {
        if (!localStorage.getItem(APP_CONFIG.rateUsKey)) {
          openRateShareModal();
        }
      }, 3000);
    }
  }

  /* ============================================================
   * INIT
   * ============================================================ */
  whenReady(function () {
    createFab();
    maybeShowRateUsPrompt();
    console.log('%cNote Counter Pro: Custom enhancements loaded', 'color:#fbbf24;font-weight:bold;');
    console.log('  - UPI QR Code generator ready');
    console.log('  - CSV export ready');
    console.log('  - Rate Us / Share App ready');
  });
})();
