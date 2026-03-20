# J&K Ojo's — Android App

## Overview
Auto parts and accessories retail shop for J&K OJO'S LTD.

## Company
- **Name:** J&K OJO'S LTD
- **Website:** http://jkojostore.uk
- **Business:** Retail trade of motor vehicle parts and accessories

## App Details
- **App name:** J&K Ojo's
- **Package:** shop.jkojosmotors.app
- **Prefix:** JOJSA
- **Type:** shop (auto parts & accessories)
- **Language:** English only (all UI, strings, comments — English)

## Design System
Extracted from company website:

- **Theme:** Dark premium automotive
- **Primary background:** #1a1f2e (dark navy)
- **Secondary background:** #2c3e50 (dark slate)
- **Accent/CTA:** #c9302c (deep red)
- **Surface:** #f8f9fa (off-white)
- **Text primary:** #2c3e50 (dark slate)
- **Text secondary:** #6c757d (muted gray)
- **Typography:** System sans-serif (Roboto), clean minimalist
- **Style:** Luxury automotive retail, modern dark theme with red accents, card-based layouts, rounded corners

## Features (Required)
1. **Product catalog** — full list of auto parts and accessories with category filtering (Engine Parts, Brakes, Suspension, Interior, Exterior, Accessories, Oils & Fluids)
2. **Shopping cart** — add/remove items, quantity adjustment, order reservation form
3. **Order confirmation** — after booking, show banner with order number, details, and notice: "Please collect your order at our store within 24 hours"
4. **Purchase history** — list of past orders with status
5. **Home page carousel** — rotating cards with car care tips and accessory information articles
6. **Settings** — company name (J&K OJO'S LTD), app version, Customer Support link → http://jkojostore.uk

## Architecture
- MVVM + Hilt DI
- Jetpack Compose UI
- Room for local persistence
- Navigation Compose
- Material 3

## Data
Use realistic auto parts data (brake pads, oil filters, spark plugs, wiper blades, car mats, phone holders, air fresheners, LED lights, etc.) with realistic GBP prices.

## Git
After finishing, commit all changes and push to origin/main.
