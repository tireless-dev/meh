package dev.tireless.meh.icon.enterprise.commerce

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Purchase: ImageVector
    get() {
        val current = _purchase
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Purchase",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M28 6 H4 a2 2 0 0 0 -2 2 v16 a2 2 0 0 0 2 2 h24 a2 2 0 0 0 2 -2 V8 a2 2 0 0 0 -2 -2 m0 2 v3 H4 V8Z M4 24 V13 h24 v11Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 28 6
                moveTo(x = 28.0f, y = 6.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // a 2 2 0 0 0 -2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                )
                // v 16
                verticalLineToRelative(dy = 16.0f)
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
                // h 24
                horizontalLineToRelative(dx = 24.0f)
                // a 2 2 0 0 0 2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                )
                // V 8
                verticalLineTo(y = 8.0f)
                // a 2 2 0 0 0 -2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
                // m 0 2
                moveToRelative(dx = 0.0f, dy = 2.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // V 8z
                verticalLineTo(y = 8.0f)
                close()
                // M 4 24
                moveTo(x = 4.0f, y = 24.0f)
                // V 13
                verticalLineTo(y = 13.0f)
                // h 24
                horizontalLineToRelative(dx = 24.0f)
                // v 11z
                verticalLineToRelative(dy = 11.0f)
                close()
            }
            // <rect width="10" height="2" x="6.0" y="20.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 6 20
                moveTo(x = 6.0f, y = 20.0f)
                // h 10
                horizontalLineToRelative(dx = 10.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -10z
                horizontalLineToRelative(dx = -10.0f)
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
        }.build().also { _purchase = it }
    }

@Suppress("ObjectPropertyName")
private var _purchase: ImageVector? = null
