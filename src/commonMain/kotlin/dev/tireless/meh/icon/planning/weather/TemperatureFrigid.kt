package dev.tireless.meh.icon.planning.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TemperatureFrigid: ImageVector
    get() {
        val current = _temperatureFrigid
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.TemperatureFrigid",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <polygon points="27.167 16.89 21.72 13.0 27.167 9.109 29.684 9.948 30.316 8.051 28.0 7.279 28.0 5.0 26.0 5.0 26.0 7.485 21.0 11.057 21.0 5.367 23.555 3.664 22.445 2.0 20.0 3.63 17.555 2.0 16.445 3.664 19.0 5.367 19.0 11.057 16.0 8.914 16.0 11.372 18.28 13.0 16.0 14.628 16.0 17.086 19.0 14.943 19.0 21.703 22.445 24.0 23.555 22.336 21.0 20.633 21.0 14.943 26.0 18.515 26.0 21.0 28.0 21.0 28.0 18.721 30.316 17.948 29.684 16.051 27.167 16.89" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 27.167 16.89
                moveTo(x = 27.167f, y = 16.89f)
                // L 21.72 13
                lineTo(x = 21.72f, y = 13.0f)
                // L 27.167 9.109
                lineTo(x = 27.167f, y = 9.109f)
                // L 29.684 9.948
                lineTo(x = 29.684f, y = 9.948f)
                // L 30.316 8.051
                lineTo(x = 30.316f, y = 8.051f)
                // L 28 7.279
                lineTo(x = 28.0f, y = 7.279f)
                // L 28 5
                lineTo(x = 28.0f, y = 5.0f)
                // L 26 5
                lineTo(x = 26.0f, y = 5.0f)
                // L 26 7.485
                lineTo(x = 26.0f, y = 7.485f)
                // L 21 11.057
                lineTo(x = 21.0f, y = 11.057f)
                // L 21 5.367
                lineTo(x = 21.0f, y = 5.367f)
                // L 23.555 3.664
                lineTo(x = 23.555f, y = 3.664f)
                // L 22.445 2
                lineTo(x = 22.445f, y = 2.0f)
                // L 20 3.63
                lineTo(x = 20.0f, y = 3.63f)
                // L 17.555 2
                lineTo(x = 17.555f, y = 2.0f)
                // L 16.445 3.664
                lineTo(x = 16.445f, y = 3.664f)
                // L 19 5.367
                lineTo(x = 19.0f, y = 5.367f)
                // L 19 11.057
                lineTo(x = 19.0f, y = 11.057f)
                // L 16 8.914
                lineTo(x = 16.0f, y = 8.914f)
                // L 16 11.372
                lineTo(x = 16.0f, y = 11.372f)
                // L 18.28 13
                lineTo(x = 18.28f, y = 13.0f)
                // L 16 14.628
                lineTo(x = 16.0f, y = 14.628f)
                // L 16 17.086
                lineTo(x = 16.0f, y = 17.086f)
                // L 19 14.943
                lineTo(x = 19.0f, y = 14.943f)
                // L 19 21.703
                lineTo(x = 19.0f, y = 21.703f)
                // L 22.445 24
                lineTo(x = 22.445f, y = 24.0f)
                // L 23.555 22.336
                lineTo(x = 23.555f, y = 22.336f)
                // L 21 20.633
                lineTo(x = 21.0f, y = 20.633f)
                // L 21 14.943
                lineTo(x = 21.0f, y = 14.943f)
                // L 26 18.515
                lineTo(x = 26.0f, y = 18.515f)
                // L 26 21
                lineTo(x = 26.0f, y = 21.0f)
                // L 28 21
                lineTo(x = 28.0f, y = 21.0f)
                // L 28 18.721
                lineTo(x = 28.0f, y = 18.721f)
                // L 30.316 17.948
                lineTo(x = 30.316f, y = 17.948f)
                // L 29.684 16.051
                lineTo(x = 29.684f, y = 16.051f)
                // L 27.167 16.89z
                lineTo(x = 27.167f, y = 16.89f)
                close()
            }
            // M12 23 a3 3 0 0 1 -6 0Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 12 23
                moveTo(x = 12.0f, y = 23.0f)
                // a 3 3 0 0 1 -6 0z
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -6.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M9 30 a7 7 0 0 1 -5 -11.89 V7 a5 5 0 0 1 10 0 v11.11 A7 7 0 0 1 9 30 M9 4 a3 3 0 0 0 -3 3 v11.98 l-.33 .3 a5 5 0 1 0 6.66 0 L12 18.98 V7 a3 3 0 0 0 -3 -3
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 9 30
                moveTo(x = 9.0f, y = 30.0f)
                // a 7 7 0 0 1 -5 -11.89
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -5.0f,
                    dy1 = -11.89f,
                )
                // V 7
                verticalLineTo(y = 7.0f)
                // a 5 5 0 0 1 10 0
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 10.0f,
                    dy1 = 0.0f,
                )
                // v 11.11
                verticalLineToRelative(dy = 11.11f)
                // A 7 7 0 0 1 9 30
                arcTo(
                    horizontalEllipseRadius = 7.0f,
                    verticalEllipseRadius = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 9.0f,
                    y1 = 30.0f,
                )
                // M 9 4
                moveTo(x = 9.0f, y = 4.0f)
                // a 3 3 0 0 0 -3 3
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -3.0f,
                    dy1 = 3.0f,
                )
                // v 11.98
                verticalLineToRelative(dy = 11.98f)
                // l -0.33 0.3
                lineToRelative(dx = -0.33f, dy = 0.3f)
                // a 5 5 0 1 0 6.66 0
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 6.66f,
                    dy1 = 0.0f,
                )
                // L 12 18.98
                lineTo(x = 12.0f, y = 18.98f)
                // V 7
                verticalLineTo(y = 7.0f)
                // a 3 3 0 0 0 -3 -3
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -3.0f,
                    dy1 = -3.0f,
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
        }.build().also { _temperatureFrigid = it }
    }

@Suppress("ObjectPropertyName")
private var _temperatureFrigid: ImageVector? = null
