package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CicsWuiRegion: ImageVector
    get() {
        val current = _cicsWuiRegion
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.CicsWuiRegion",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <polygon points="22.0 22.0 24.0 22.0 24.0 28.0 22.0 28.0 22.0 30.0 28.0 30.0 28.0 28.0 26.0 28.0 26.0 22.0 28.0 22.0 28.0 20.0 22.0 20.0 22.0 22.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 22 22
                moveTo(x = 22.0f, y = 22.0f)
                // L 24 22
                lineTo(x = 24.0f, y = 22.0f)
                // L 24 28
                lineTo(x = 24.0f, y = 28.0f)
                // L 22 28
                lineTo(x = 22.0f, y = 28.0f)
                // L 22 30
                lineTo(x = 22.0f, y = 30.0f)
                // L 28 30
                lineTo(x = 28.0f, y = 30.0f)
                // L 28 28
                lineTo(x = 28.0f, y = 28.0f)
                // L 26 28
                lineTo(x = 26.0f, y = 28.0f)
                // L 26 22
                lineTo(x = 26.0f, y = 22.0f)
                // L 28 22
                lineTo(x = 28.0f, y = 22.0f)
                // L 28 20
                lineTo(x = 28.0f, y = 20.0f)
                // L 22 20
                lineTo(x = 22.0f, y = 20.0f)
                // L 22 22z
                lineTo(x = 22.0f, y = 22.0f)
                close()
            }
            // M18 28 h-2 v-8 h-2 v8.6 a1.45 1.45 0 0 0 1.5 1.4 h3 a1.45 1.45 0 0 0 1.5 -1.4 V20 h-2Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 18 28
                moveTo(x = 18.0f, y = 28.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v -8
                verticalLineToRelative(dy = -8.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v 8.6
                verticalLineToRelative(dy = 8.6f)
                // a 1.45 1.45 0 0 0 1.5 1.4
                arcToRelative(
                    a = 1.45f,
                    b = 1.45f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.5f,
                    dy1 = 1.4f,
                )
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // a 1.45 1.45 0 0 0 1.5 -1.4
                arcToRelative(
                    a = 1.45f,
                    b = 1.45f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.5f,
                    dy1 = -1.4f,
                )
                // V 20
                verticalLineTo(y = 20.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            // <polygon points="10.2 20.0 10.0 28.5 9.0 22.0 7.0 22.0 6.0 28.5 5.8 20.0 4.0 20.0 4.72 30.0 7.0 30.0 8.0 23.5 9.0 30.0 11.28 30.0 12.0 20.0 10.2 20.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 10.2 20
                moveTo(x = 10.2f, y = 20.0f)
                // L 10 28.5
                lineTo(x = 10.0f, y = 28.5f)
                // L 9 22
                lineTo(x = 9.0f, y = 22.0f)
                // L 7 22
                lineTo(x = 7.0f, y = 22.0f)
                // L 6 28.5
                lineTo(x = 6.0f, y = 28.5f)
                // L 5.8 20
                lineTo(x = 5.8f, y = 20.0f)
                // L 4 20
                lineTo(x = 4.0f, y = 20.0f)
                // L 4.72 30
                lineTo(x = 4.72f, y = 30.0f)
                // L 7 30
                lineTo(x = 7.0f, y = 30.0f)
                // L 8 23.5
                lineTo(x = 8.0f, y = 23.5f)
                // L 9 30
                lineTo(x = 9.0f, y = 30.0f)
                // L 11.28 30
                lineTo(x = 11.28f, y = 30.0f)
                // L 12 20
                lineTo(x = 12.0f, y = 20.0f)
                // L 10.2 20z
                lineTo(x = 10.2f, y = 20.0f)
                close()
            }
            // <polygon points="16.0 11.0 13.0 11.0 13.0 8.0 11.0 8.0 11.0 11.0 8.0 11.0 8.0 13.0 11.0 13.0 11.0 16.0 13.0 16.0 13.0 13.0 16.0 13.0 16.0 11.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 16 11
                moveTo(x = 16.0f, y = 11.0f)
                // L 13 11
                lineTo(x = 13.0f, y = 11.0f)
                // L 13 8
                lineTo(x = 13.0f, y = 8.0f)
                // L 11 8
                lineTo(x = 11.0f, y = 8.0f)
                // L 11 11
                lineTo(x = 11.0f, y = 11.0f)
                // L 8 11
                lineTo(x = 8.0f, y = 11.0f)
                // L 8 13
                lineTo(x = 8.0f, y = 13.0f)
                // L 11 13
                lineTo(x = 11.0f, y = 13.0f)
                // L 11 16
                lineTo(x = 11.0f, y = 16.0f)
                // L 13 16
                lineTo(x = 13.0f, y = 16.0f)
                // L 13 13
                lineTo(x = 13.0f, y = 13.0f)
                // L 16 13
                lineTo(x = 16.0f, y = 13.0f)
                // L 16 11z
                lineTo(x = 16.0f, y = 11.0f)
                close()
            }
            // M26 4 H6 a2 2 0 0 0 -2 2 v12 h2 V6 h20 v12 h2 V6 a2 2 0 0 0 -2 -2
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 26 4
                moveTo(x = 26.0f, y = 4.0f)
                // H 6
                horizontalLineTo(x = 6.0f)
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
                // v 12
                verticalLineToRelative(dy = 12.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // V 6
                verticalLineTo(y = 6.0f)
                // h 20
                horizontalLineToRelative(dx = 20.0f)
                // v 12
                verticalLineToRelative(dy = 12.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
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
        }.build().also { _cicsWuiRegion = it }
    }

@Suppress("ObjectPropertyName")
private var _cicsWuiRegion: ImageVector? = null
