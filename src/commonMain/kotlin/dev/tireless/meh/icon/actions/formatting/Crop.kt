package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Crop: ImageVector
    get() {
        val current = _crop
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Crop",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M25 20 h-2 V9 H12 V7 h11 a2 2 0 0 1 2 2Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 25 20
                moveTo(x = 25.0f, y = 20.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // V 9
                verticalLineTo(y = 9.0f)
                // H 12
                horizontalLineTo(x = 12.0f)
                // V 7
                verticalLineTo(y = 7.0f)
                // h 11
                horizontalLineToRelative(dx = 11.0f)
                // a 2 2 0 0 1 2 2z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
                close()
            }
            // M9 23 V2 H7 v5 H2 v2 h5 v14 a2 2 0 0 0 2 2 h14 v5 h2 v-5 h5 v-2Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 9 23
                moveTo(x = 9.0f, y = 23.0f)
                // V 2
                verticalLineTo(y = 2.0f)
                // H 7
                horizontalLineTo(x = 7.0f)
                // v 5
                verticalLineToRelative(dy = 5.0f)
                // H 2
                horizontalLineTo(x = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 5
                horizontalLineToRelative(dx = 5.0f)
                // v 14
                verticalLineToRelative(dy = 14.0f)
                // a 2 2 0 0 0 2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
                // h 14
                horizontalLineToRelative(dx = 14.0f)
                // v 5
                verticalLineToRelative(dy = 5.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v -5
                verticalLineToRelative(dy = -5.0f)
                // h 5
                horizontalLineToRelative(dx = 5.0f)
                // v -2z
                verticalLineToRelative(dy = -2.0f)
                close()
            }
            // <rect width="32" height="32" fill="#000" style="fill:none" />
            path(
                fill = SolidColor(Color.Transparent),
            ) {
                // M 0 0
                moveTo(x = 0.0f, y = 0.0f)
                // h 32
                horizontalLineToRelative(dx = 32.0f)
                // v 32
                verticalLineToRelative(dy = 32.0f)
                // h -32z
                horizontalLineToRelative(dx = -32.0f)
                close()
            }
        }.build().also { _crop = it }
    }

@Suppress("ObjectPropertyName")
private var _crop: ImageVector? = null
