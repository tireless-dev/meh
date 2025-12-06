package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Select01: ImageVector
    get() {
        val current = _select01
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Select01",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <polygon points="12.0 6.0 8.0 6.0 8.0 2.0 6.0 2.0 6.0 6.0 2.0 6.0 2.0 8.0 6.0 8.0 6.0 12.0 8.0 12.0 8.0 8.0 12.0 8.0 12.0 6.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 12 6
                moveTo(x = 12.0f, y = 6.0f)
                // L 8 6
                lineTo(x = 8.0f, y = 6.0f)
                // L 8 2
                lineTo(x = 8.0f, y = 2.0f)
                // L 6 2
                lineTo(x = 6.0f, y = 2.0f)
                // L 6 6
                lineTo(x = 6.0f, y = 6.0f)
                // L 2 6
                lineTo(x = 2.0f, y = 6.0f)
                // L 2 8
                lineTo(x = 2.0f, y = 8.0f)
                // L 6 8
                lineTo(x = 6.0f, y = 8.0f)
                // L 6 12
                lineTo(x = 6.0f, y = 12.0f)
                // L 8 12
                lineTo(x = 8.0f, y = 12.0f)
                // L 8 8
                lineTo(x = 8.0f, y = 8.0f)
                // L 12 8
                lineTo(x = 12.0f, y = 8.0f)
                // L 12 6z
                lineTo(x = 12.0f, y = 6.0f)
                close()
            }
            // <rect width="4" height="2" x="16.0" y="6.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 16 6
                moveTo(x = 16.0f, y = 6.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -4z
                horizontalLineToRelative(dx = -4.0f)
                close()
            }
            // M24 6 v2 h4 v4 h2 V8 a2 2 0 0 0 -2 -2Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 24 6
                moveTo(x = 24.0f, y = 6.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // V 8
                verticalLineTo(y = 8.0f)
                // a 2 2 0 0 0 -2 -2z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
                close()
            }
            // <rect width="2" height="4" x="6.0" y="16.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 6 16
                moveTo(x = 6.0f, y = 16.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            // M8 28 v-4 H6 v4 a2 2 0 0 0 2 2 h4 v-2Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 8 28
                moveTo(x = 8.0f, y = 28.0f)
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // H 6
                horizontalLineTo(x = 6.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
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
                // v -2z
                verticalLineToRelative(dy = -2.0f)
                close()
            }
            // <rect width="2" height="4" x="28.0" y="16.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 28 16
                moveTo(x = 28.0f, y = 16.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            // <rect width="4" height="2" x="16.0" y="28.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 16 28
                moveTo(x = 16.0f, y = 28.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -4z
                horizontalLineToRelative(dx = -4.0f)
                close()
            }
            // M28 24 v4 h-4 v2 h4 a2 2 0 0 0 2 -2 v-4Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 28 24
                moveTo(x = 28.0f, y = 24.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
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
                // v -4z
                verticalLineToRelative(dy = -4.0f)
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
        }.build().also { _select01 = it }
    }

@Suppress("ObjectPropertyName")
private var _select01: ImageVector? = null
