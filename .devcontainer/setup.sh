#!/bin/bash
# ---------------------------------------------------------------------
# Codespace Post-Create Setup Script - Frozen Environment Edition
# Locks Environment to Chrome for Testing v125 & Pre-caches Maven
# ---------------------------------------------------------------------

echo "🚀 Provisioning Debian Sandbox environment..."

# 1. Update package listings and install unzip utilities
sudo apt-get update
sudo apt-get install -y unzip wget libatk1.0-0 libatk-bridge2.0-0 libcups2 libdrm2 \
                        libxkbcommon0 libxcomposite1 libxdamage1 libxrandr2 \
                        libgbm1 libpango-1.0-0 libcairo2 libasound2

# 2. Define the targeted locked Chrome major build
CHROME_VERSION="125.0.6422.60"
echo "📥 Downloading frozen Chrome for Testing variant: [${CHROME_VERSION}]..."

# 3. Pull down the exact Linux64 compilation package
wget "https://storage.googleapis.com/chrome-for-testing-public/${CHROME_VERSION}/linux64/chrome-linux64.zip" -O /tmp/chrome.zip

# 4. Extract package binaries into /opt/ target zone
echo "🛠️ Extracting binaries and creating system paths..."
sudo unzip -q /tmp/chrome.zip -d /opt/

# 5. Build an absolute executable alias link so WebDriverManager automatically discovers it
sudo ln -sf /opt/chrome-linux64/chrome /usr/bin/google-chrome
sudo ln -sf /opt/chrome-linux64/chrome /usr/bin/chrome

# 6. Housekeeping - purge downloaded temporary files
rm /tmp/chrome.zip

# 7. Pre-seed Maven build cache with dependencies (WebDriverManager, Selenium, TestNG)
echo "📦 Warming up Maven local dependency cache..."
mvn clean install

echo "✅ Environment deployment finalized! Chrome ${CHROME_VERSION} locked and ready."