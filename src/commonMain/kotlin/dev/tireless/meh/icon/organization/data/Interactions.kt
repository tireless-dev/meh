package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Interactions: ImageVector
    get() {
        val current = _interactions
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Interactions",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M26 18 h-4 v-4 h-2 v14 h6 a2 2 0 0 0 2 -2 v-6 a2 2 0 0 0 -2 -2 m-4 8 v-6 h4 v6Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 26 18
                moveTo(x = 26.0f, y = 18.0f)
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v 14
                verticalLineToRelative(dy = 14.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
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
                // v -6
                verticalLineToRelative(dy = -6.0f)
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
                // m -4 8
                moveToRelative(dx = -4.0f, dy = 8.0f)
                // v -6
                verticalLineToRelative(dy = -6.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 6z
                verticalLineToRelative(dy = 6.0f)
                close()
            }
            // <polygon points="20.0 6.076 19.256 4.219 16.0 5.522 16.0 2.0 14.0 2.0 14.0 5.523 10.744 4.22 10.0 6.077 13.417 7.444 10.9 10.8 12.5 12.0 15.0 8.667 17.5 12.0 19.1 10.8 16.583 7.443 20.0 6.076" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 20 6.076
                moveTo(x = 20.0f, y = 6.076f)
                // L 19.256 4.219
                lineTo(x = 19.256f, y = 4.219f)
                // L 16 5.522
                lineTo(x = 16.0f, y = 5.522f)
                // L 16 2
                lineTo(x = 16.0f, y = 2.0f)
                // L 14 2
                lineTo(x = 14.0f, y = 2.0f)
                // L 14 5.523
                lineTo(x = 14.0f, y = 5.523f)
                // L 10.744 4.22
                lineTo(x = 10.744f, y = 4.22f)
                // L 10 6.077
                lineTo(x = 10.0f, y = 6.077f)
                // L 13.417 7.444
                lineTo(x = 13.417f, y = 7.444f)
                // L 10.9 10.8
                lineTo(x = 10.9f, y = 10.8f)
                // L 12.5 12
                lineTo(x = 12.5f, y = 12.0f)
                // L 15 8.667
                lineTo(x = 15.0f, y = 8.667f)
                // L 17.5 12
                lineTo(x = 17.5f, y = 12.0f)
                // L 19.1 10.8
                lineTo(x = 19.1f, y = 10.8f)
                // L 16.583 7.443
                lineTo(x = 16.583f, y = 7.443f)
                // L 20 6.076z
                lineTo(x = 20.0f, y = 6.076f)
                close()
            }
            // M10 18 H5 v2 h5 v2 H6 a2 2 0 0 0 -2 2 v2 a2 2 0 0 0 2 2 h6 v-8 a2 2 0 0 0 -2 -2 m0 8 H6 v-2 h4Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 10 18
                moveTo(x = 10.0f, y = 18.0f)
                // H 5
                horizontalLineTo(x = 5.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 5
                horizontalLineToRelative(dx = 5.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
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
                // v 2
                verticalLineToRelative(dy = 2.0f)
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
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // v -8
                verticalLineToRelative(dy = -8.0f)
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
                // m 0 8
                moveToRelative(dx = 0.0f, dy = 8.0f)
                // H 6
                horizontalLineTo(x = 6.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h 4z
                horizontalLineToRelative(dx = 4.0f)
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
        }.build().also { _interactions = it }
    }

@Suppress("ObjectPropertyName")
private var _interactions: ImageVector? = null
