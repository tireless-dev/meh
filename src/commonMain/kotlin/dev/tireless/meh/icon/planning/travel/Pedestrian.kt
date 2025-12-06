package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Pedestrian: ImageVector
    get() {
        val current = _pedestrian
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Pedestrian",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // m21.68 14 -1.25 -3.11 A3 3 0 0 0 17.65 9 h-4.1 a3 3 0 0 0 -1.54 .43 l-5.01 3 V18 h2 v-4.43 l3 -1.8 V23.7 l-3.46 5.2 L10.2 30 l3.8 -5.7 V11 h3.65 a1 1 0 0 1 .92 .63 L20.32 16 H26 v-2Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 21.68 14
                moveTo(x = 21.68f, y = 14.0f)
                // l -1.25 -3.11
                lineToRelative(dx = -1.25f, dy = -3.11f)
                // A 3 3 0 0 0 17.65 9
                arcTo(
                    horizontalEllipseRadius = 3.0f,
                    verticalEllipseRadius = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 17.65f,
                    y1 = 9.0f,
                )
                // h -4.1
                horizontalLineToRelative(dx = -4.1f)
                // a 3 3 0 0 0 -1.54 0.43
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.54f,
                    dy1 = 0.43f,
                )
                // l -5.01 3
                lineToRelative(dx = -5.01f, dy = 3.0f)
                // V 18
                verticalLineTo(y = 18.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v -4.43
                verticalLineToRelative(dy = -4.43f)
                // l 3 -1.8
                lineToRelative(dx = 3.0f, dy = -1.8f)
                // V 23.7
                verticalLineTo(y = 23.7f)
                // l -3.46 5.2
                lineToRelative(dx = -3.46f, dy = 5.2f)
                // L 10.2 30
                lineTo(x = 10.2f, y = 30.0f)
                // l 3.8 -5.7
                lineToRelative(dx = 3.8f, dy = -5.7f)
                // V 11
                verticalLineTo(y = 11.0f)
                // h 3.65
                horizontalLineToRelative(dx = 3.65f)
                // a 1 1 0 0 1 0.92 0.63
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.92f,
                    dy1 = 0.63f,
                )
                // L 20.32 16
                lineTo(x = 20.32f, y = 16.0f)
                // H 26
                horizontalLineTo(x = 26.0f)
                // v -2z
                verticalLineToRelative(dy = -2.0f)
                close()
            }
            // <polygon points="17.051 18.316 19.0 24.162 19.0 30.0 21.0 30.0 21.0 23.838 18.949 17.684 17.051 18.316" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 17.051 18.316
                moveTo(x = 17.051f, y = 18.316f)
                // L 19 24.162
                lineTo(x = 19.0f, y = 24.162f)
                // L 19 30
                lineTo(x = 19.0f, y = 30.0f)
                // L 21 30
                lineTo(x = 21.0f, y = 30.0f)
                // L 21 23.838
                lineTo(x = 21.0f, y = 23.838f)
                // L 18.949 17.684
                lineTo(x = 18.949f, y = 17.684f)
                // L 17.051 18.316z
                lineTo(x = 17.051f, y = 18.316f)
                close()
            }
            // M16.5 8 A3.5 3.5 0 1 1 20 4.5 3.5 3.5 0 0 1 16.5 8 m0 -5 A1.5 1.5 0 1 0 18 4.5 1.5 1.5 0 0 0 16.5 3
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 16.5 8
                moveTo(x = 16.5f, y = 8.0f)
                // A 3.5 3.5 0 1 1 20 4.5
                arcTo(
                    horizontalEllipseRadius = 3.5f,
                    verticalEllipseRadius = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    x1 = 20.0f,
                    y1 = 4.5f,
                )
                // A 3.5 3.5 0 0 1 16.5 8
                arcTo(
                    horizontalEllipseRadius = 3.5f,
                    verticalEllipseRadius = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 16.5f,
                    y1 = 8.0f,
                )
                // m 0 -5
                moveToRelative(dx = 0.0f, dy = -5.0f)
                // A 1.5 1.5 0 1 0 18 4.5
                arcTo(
                    horizontalEllipseRadius = 1.5f,
                    verticalEllipseRadius = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    x1 = 18.0f,
                    y1 = 4.5f,
                )
                // A 1.5 1.5 0 0 0 16.5 3
                arcTo(
                    horizontalEllipseRadius = 1.5f,
                    verticalEllipseRadius = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 16.5f,
                    y1 = 3.0f,
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
        }.build().also { _pedestrian = it }
    }

@Suppress("ObjectPropertyName")
private var _pedestrian: ImageVector? = null
