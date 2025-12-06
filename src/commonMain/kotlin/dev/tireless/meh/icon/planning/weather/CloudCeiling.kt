package dev.tireless.meh.icon.planning.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CloudCeiling: ImageVector
    get() {
        val current = _cloudCeiling
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.CloudCeiling",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <rect width="9" height="2" x="2.0" y="28.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 2 28
                moveTo(x = 2.0f, y = 28.0f)
                // h 9
                horizontalLineToRelative(dx = 9.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -9z
                horizontalLineToRelative(dx = -9.0f)
                close()
            }
            // <rect width="9" height="2" x="21.0" y="28.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 21 28
                moveTo(x = 21.0f, y = 28.0f)
                // h 9
                horizontalLineToRelative(dx = 9.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -9z
                horizontalLineToRelative(dx = -9.0f)
                close()
            }
            // <polygon points="17.0 26.167 17.0 17.832 19.586 20.414 21.0 19.0 16.0 14.0 11.0 19.0 12.413 20.415 15.0 17.832 15.0 26.167 12.413 23.584 11.0 25.0 16.0 30.0 21.0 25.0 19.586 23.586 17.0 26.167" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 17 26.167
                moveTo(x = 17.0f, y = 26.167f)
                // L 17 17.832
                lineTo(x = 17.0f, y = 17.832f)
                // L 19.586 20.414
                lineTo(x = 19.586f, y = 20.414f)
                // L 21 19
                lineTo(x = 21.0f, y = 19.0f)
                // L 16 14
                lineTo(x = 16.0f, y = 14.0f)
                // L 11 19
                lineTo(x = 11.0f, y = 19.0f)
                // L 12.413 20.415
                lineTo(x = 12.413f, y = 20.415f)
                // L 15 17.832
                lineTo(x = 15.0f, y = 17.832f)
                // L 15 26.167
                lineTo(x = 15.0f, y = 26.167f)
                // L 12.413 23.584
                lineTo(x = 12.413f, y = 23.584f)
                // L 11 25
                lineTo(x = 11.0f, y = 25.0f)
                // L 16 30
                lineTo(x = 16.0f, y = 30.0f)
                // L 21 25
                lineTo(x = 21.0f, y = 25.0f)
                // L 19.586 23.586
                lineTo(x = 19.586f, y = 23.586f)
                // L 17 26.167z
                lineTo(x = 17.0f, y = 26.167f)
                close()
            }
            // M23 16 h-2 v-2 h2 a3 3 0 0 0 0 -6 l-.22 .03 -.8 .05 -.23 -.77 a6 6 0 0 0 -11.17 -.87 l-.28 .6 L9.45 7 a3.5 3.5 0 0 0 .05 7 H11 v2 H9.5 A5.5 5.5 0 0 1 9.07 5.02 a8 8 0 0 1 14.35 1 A5 5 0 0 1 23 16
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 23 16
                moveTo(x = 23.0f, y = 16.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // a 3 3 0 0 0 0 -6
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = -6.0f,
                )
                // l -0.22 0.03
                lineToRelative(dx = -0.22f, dy = 0.03f)
                // l -0.8 0.05
                lineToRelative(dx = -0.8f, dy = 0.05f)
                // l -0.23 -0.77
                lineToRelative(dx = -0.23f, dy = -0.77f)
                // a 6 6 0 0 0 -11.17 -0.87
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -11.17f,
                    dy1 = -0.87f,
                )
                // l -0.28 0.6
                lineToRelative(dx = -0.28f, dy = 0.6f)
                // L 9.45 7
                lineTo(x = 9.45f, y = 7.0f)
                // a 3.5 3.5 0 0 0 0.05 7
                arcToRelative(
                    a = 3.5f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.05f,
                    dy1 = 7.0f,
                )
                // H 11
                horizontalLineTo(x = 11.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // H 9.5
                horizontalLineTo(x = 9.5f)
                // A 5.5 5.5 0 0 1 9.07 5.02
                arcTo(
                    horizontalEllipseRadius = 5.5f,
                    verticalEllipseRadius = 5.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 9.07f,
                    y1 = 5.02f,
                )
                // a 8 8 0 0 1 14.35 1
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 14.35f,
                    dy1 = 1.0f,
                )
                // A 5 5 0 0 1 23 16
                arcTo(
                    horizontalEllipseRadius = 5.0f,
                    verticalEllipseRadius = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 23.0f,
                    y1 = 16.0f,
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
        }.build().also { _cloudCeiling = it }
    }

@Suppress("ObjectPropertyName")
private var _cloudCeiling: ImageVector? = null
