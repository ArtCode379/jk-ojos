package shop.jkojosmotors.app.data.model

import androidx.annotation.StringRes
import shop.jkojosmotors.app.R

enum class ProductCategory(@field:StringRes val titleRes: Int) {
    ENGINE_PARTS(R.string.category_engine_parts),
    BRAKES(R.string.category_brakes),
    SUSPENSION(R.string.category_suspension),
    INTERIOR(R.string.category_interior),
    EXTERIOR(R.string.category_exterior),
    ACCESSORIES(R.string.category_accessories),
    OILS_AND_FLUIDS(R.string.category_oils_and_fluids),
}
