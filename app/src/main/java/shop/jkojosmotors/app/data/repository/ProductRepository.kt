package shop.jkojosmotors.app.data.repository

import shop.jkojosmotors.app.R
import shop.jkojosmotors.app.data.model.Product
import shop.jkojosmotors.app.data.model.ProductCategory
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf

class ProductRepository {
    private val products: List<Product> = listOf(
        // Engine Parts
        Product(
            id = 1,
            title = "Bosch Spark Plugs (Set of 4)",
            description = "High-performance iridium spark plugs for improved ignition and fuel efficiency. Compatible with most petrol engines. Long-lasting design with up to 60,000 miles service life.",
            category = ProductCategory.ENGINE_PARTS,
            price = 24.99,
            imageRes = R.drawable.ic_product_engine,
        ),
        Product(
            id = 2,
            title = "Mann Oil Filter",
            description = "Premium quality oil filter that removes contaminants from engine oil. Ensures smooth engine operation and extends engine life. Fits most popular vehicle models.",
            category = ProductCategory.ENGINE_PARTS,
            price = 8.49,
            imageRes = R.drawable.ic_product_engine,
        ),
        Product(
            id = 3,
            title = "Dayco Timing Belt Kit",
            description = "Complete timing belt replacement kit including belt, tensioner, and idler pulley. Essential for preventing engine damage. Professional-grade quality.",
            category = ProductCategory.ENGINE_PARTS,
            price = 89.99,
            imageRes = R.drawable.ic_product_engine,
        ),
        Product(
            id = 4,
            title = "K&N Air Filter",
            description = "Washable and reusable high-flow air filter. Increases horsepower and acceleration. Lasts up to 50,000 miles between cleanings.",
            category = ProductCategory.ENGINE_PARTS,
            price = 42.95,
            imageRes = R.drawable.ic_product_engine,
        ),

        // Brakes
        Product(
            id = 5,
            title = "Brembo Front Brake Pads",
            description = "Premium ceramic brake pads for superior stopping power. Low dust formula keeps wheels clean. Designed for quiet, vibration-free braking.",
            category = ProductCategory.BRAKES,
            price = 34.99,
            imageRes = R.drawable.ic_product_brakes,
        ),
        Product(
            id = 6,
            title = "Bosch Brake Discs (Pair)",
            description = "Precision-machined ventilated brake discs for optimal heat dissipation. OE-quality replacement for reliable braking performance.",
            category = ProductCategory.BRAKES,
            price = 64.99,
            imageRes = R.drawable.ic_product_brakes,
        ),
        Product(
            id = 7,
            title = "ATE Brake Fluid DOT 4",
            description = "High-performance brake fluid exceeding DOT 4 specifications. Provides consistent pedal feel in all conditions. 1 litre bottle.",
            category = ProductCategory.BRAKES,
            price = 12.99,
            imageRes = R.drawable.ic_product_brakes,
        ),

        // Suspension
        Product(
            id = 8,
            title = "Monroe Shock Absorbers (Pair)",
            description = "Gas-charged shock absorbers for improved ride comfort and handling. Direct OE replacement with easy bolt-on installation.",
            category = ProductCategory.SUSPENSION,
            price = 79.99,
            imageRes = R.drawable.ic_product_suspension,
        ),
        Product(
            id = 9,
            title = "Lemforder Front Control Arm",
            description = "OE-quality front lower control arm with ball joint. Precision-engineered for accurate wheel alignment and handling response.",
            category = ProductCategory.SUSPENSION,
            price = 54.99,
            imageRes = R.drawable.ic_product_suspension,
        ),
        Product(
            id = 10,
            title = "Sachs Coil Spring (Front)",
            description = "Heavy-duty replacement coil spring manufactured to OE specifications. Restores original ride height and handling characteristics.",
            category = ProductCategory.SUSPENSION,
            price = 39.99,
            imageRes = R.drawable.ic_product_suspension,
        ),

        // Interior
        Product(
            id = 11,
            title = "Premium Rubber Car Mats (Set of 4)",
            description = "Heavy-duty rubber floor mats with deep channels to trap water, mud, and debris. Custom-fit design with anti-slip backing. Easy to clean.",
            category = ProductCategory.INTERIOR,
            price = 29.99,
            imageRes = R.drawable.ic_product_interior,
        ),
        Product(
            id = 12,
            title = "Leather Steering Wheel Cover",
            description = "Genuine leather steering wheel cover with anti-slip grip. Universal fit for 37-38cm steering wheels. Elegant black finish.",
            category = ProductCategory.INTERIOR,
            price = 18.99,
            imageRes = R.drawable.ic_product_interior,
        ),
        Product(
            id = 13,
            title = "Universal Seat Covers (Front Pair)",
            description = "Breathable fabric seat covers with side airbag compatibility. Protects original upholstery from wear and stains. Machine washable.",
            category = ProductCategory.INTERIOR,
            price = 34.99,
            imageRes = R.drawable.ic_product_interior,
        ),

        // Exterior
        Product(
            id = 14,
            title = "Bosch Aerotwin Wiper Blades (Pair)",
            description = "Flat wiper blades with aerodynamic design for streak-free wiping. Quick-fit adapter system. Reduces wind noise at high speeds.",
            category = ProductCategory.EXTERIOR,
            price = 22.99,
            imageRes = R.drawable.ic_product_exterior,
        ),
        Product(
            id = 15,
            title = "LED Headlight Bulbs H7 (Pair)",
            description = "Ultra-bright LED headlight conversion kit. 300% brighter than halogen. 6000K cool white light with 50,000 hour lifespan.",
            category = ProductCategory.EXTERIOR,
            price = 39.99,
            imageRes = R.drawable.ic_product_exterior,
        ),
        Product(
            id = 16,
            title = "Chrome Door Handle Covers",
            description = "High-quality chrome-finish door handle covers. Adds a premium look to your vehicle. Easy peel-and-stick installation.",
            category = ProductCategory.EXTERIOR,
            price = 15.99,
            imageRes = R.drawable.ic_product_exterior,
        ),

        // Accessories
        Product(
            id = 17,
            title = "Magnetic Phone Holder",
            description = "Strong magnetic car phone mount for dashboard or air vent. 360-degree rotation. Compatible with all smartphones. One-hand operation.",
            category = ProductCategory.ACCESSORIES,
            price = 14.99,
            imageRes = R.drawable.ic_product_accessories,
        ),
        Product(
            id = 18,
            title = "Car Air Freshener (3-Pack)",
            description = "Long-lasting premium car air fresheners with new car scent. Hangs from rear-view mirror. Each freshener lasts up to 30 days.",
            category = ProductCategory.ACCESSORIES,
            price = 6.99,
            imageRes = R.drawable.ic_product_accessories,
        ),
        Product(
            id = 19,
            title = "Dash Cam 1080p HD",
            description = "Full HD dash camera with 170-degree wide angle lens. Loop recording, G-sensor, and parking monitor. Includes 32GB SD card.",
            category = ProductCategory.ACCESSORIES,
            price = 49.99,
            imageRes = R.drawable.ic_product_accessories,
        ),
        Product(
            id = 20,
            title = "USB Car Charger (Dual Port)",
            description = "Fast-charging dual USB car charger with Quick Charge 3.0. Compact aluminium design. Compatible with all USB devices.",
            category = ProductCategory.ACCESSORIES,
            price = 9.99,
            imageRes = R.drawable.ic_product_accessories,
        ),

        // Oils & Fluids
        Product(
            id = 21,
            title = "Castrol Edge 5W-30 (5L)",
            description = "Fully synthetic engine oil with Fluid Titanium Technology. Reduces metal-to-metal contact across a range of driving speeds. Suitable for petrol and diesel engines.",
            category = ProductCategory.OILS_AND_FLUIDS,
            price = 36.99,
            imageRes = R.drawable.ic_product_oils,
        ),
        Product(
            id = 22,
            title = "Comma Antifreeze Coolant (5L)",
            description = "Ready-mixed OAT antifreeze and coolant. Provides protection down to -36 degrees C. Compatible with all major vehicle manufacturers.",
            category = ProductCategory.OILS_AND_FLUIDS,
            price = 14.99,
            imageRes = R.drawable.ic_product_oils,
        ),
        Product(
            id = 23,
            title = "Power Steering Fluid (1L)",
            description = "Universal power steering fluid for hydraulic steering systems. Protects against wear and foam build-up. Compatible with most vehicles.",
            category = ProductCategory.OILS_AND_FLUIDS,
            price = 8.99,
            imageRes = R.drawable.ic_product_oils,
        ),
        Product(
            id = 24,
            title = "Screenwash Concentrate (5L)",
            description = "Highly concentrated screenwash that removes road grime, insects, and tree sap. Effective down to -10 degrees C when diluted.",
            category = ProductCategory.OILS_AND_FLUIDS,
            price = 5.99,
            imageRes = R.drawable.ic_product_oils,
        ),
    )

    fun observeById(id: Int): Flow<Product?> {
        val item = products.find { it.id == id }
        return flowOf(item)
    }

    fun getById(id: Int): Product? {
        return products.find { it.id == id }
    }

    fun observeAll(): Flow<List<Product>> {
        return flowOf(products)
    }
}
