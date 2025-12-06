package dev.tireless.meh.icon.actions.toggle

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Column: ImageVector
    get() {
        val current = _column
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Column",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <rect width="2" height="24" x="24.0" y="4.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 24 4
                moveTo(x = 24.0f, y = 4.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 24
                verticalLineToRelative(dy = 24.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            // M18 6 v20 h-4 V6z m0 -2 h-4 a2 2 0 0 0 -2 2 v20 a2 2 0 0 0 2 2 h4 a2 2 0 0 0 2 -2 V6 a2 2 0 0 0 -2 -2
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 18 6
                moveTo(x = 18.0f, y = 6.0f)
                // v 20
                verticalLineToRelative(dy = 20.0f)
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // V 6z
                verticalLineTo(y = 6.0f)
                close()
                // m 0 -2
                moveToRelative(dx = 0.0f, dy = -2.0f)
                // h -4
                horizontalLineToRelative(dx = -4.0f)
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
                // v 20
                verticalLineToRelative(dy = 20.0f)
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
                // h 4
                horizontalLineToRelative(dx = 4.0f)
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
                // V 6
                verticalLineTo(y = 6.0f)
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
            }
            // <rect width="2" height="24" x="6.0" y="4.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 6 4
                moveTo(x = 6.0f, y = 4.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 24
                verticalLineToRelative(dy = 24.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
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
        }.build().also { _column = it }
    }

@Suppress("ObjectPropertyName")
private var _column: ImageVector? = null
