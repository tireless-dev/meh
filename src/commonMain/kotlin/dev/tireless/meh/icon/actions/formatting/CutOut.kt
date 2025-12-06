package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CutOut: ImageVector
    get() {
        val current = _cutOut
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.CutOut",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // m19.05 13.73 -1 -1.73 -10.12 5.85 -1 -.58 A3 3 0 0 0 7.6 16.5 a3 3 0 1 0 -4.1 1.1 L5.93 19 3.5 20.4 a3.03 3.03 0 1 0 3.44 .32 l.99 -.56 L14.59 24 l1 -1.73 L9.93 19Z M4.03 15.26 a1 1 0 1 1 .47 .6 1 1 0 0 1 -.47 -.6 M5 22 a1 1 0 1 1 -.87 1.5 A1 1 0 0 1 5 22
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 19.05 13.73
                moveTo(x = 19.05f, y = 13.73f)
                // l -1 -1.73
                lineToRelative(dx = -1.0f, dy = -1.73f)
                // l -10.12 5.85
                lineToRelative(dx = -10.12f, dy = 5.85f)
                // l -1 -0.58
                lineToRelative(dx = -1.0f, dy = -0.58f)
                // A 3 3 0 0 0 7.6 16.5
                arcTo(
                    horizontalEllipseRadius = 3.0f,
                    verticalEllipseRadius = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 7.6f,
                    y1 = 16.5f,
                )
                // a 3 3 0 1 0 -4.1 1.1
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -4.1f,
                    dy1 = 1.1f,
                )
                // L 5.93 19
                lineTo(x = 5.93f, y = 19.0f)
                // L 3.5 20.4
                lineTo(x = 3.5f, y = 20.4f)
                // a 3.03 3.03 0 1 0 3.44 0.32
                arcToRelative(
                    a = 3.03f,
                    b = 3.03f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 3.44f,
                    dy1 = 0.32f,
                )
                // l 0.99 -0.56
                lineToRelative(dx = 0.99f, dy = -0.56f)
                // L 14.59 24
                lineTo(x = 14.59f, y = 24.0f)
                // l 1 -1.73
                lineToRelative(dx = 1.0f, dy = -1.73f)
                // L 9.93 19z
                lineTo(x = 9.93f, y = 19.0f)
                close()
                // M 4.03 15.26
                moveTo(x = 4.03f, y = 15.26f)
                // a 1 1 0 1 1 0.47 0.6
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 0.47f,
                    dy1 = 0.6f,
                )
                // a 1 1 0 0 1 -0.47 -0.6
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.47f,
                    dy1 = -0.6f,
                )
                // M 5 22
                moveTo(x = 5.0f, y = 22.0f)
                // a 1 1 0 1 1 -0.87 1.5
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -0.87f,
                    dy1 = 1.5f,
                )
                // A 1 1 0 0 1 5 22
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 5.0f,
                    y1 = 22.0f,
                )
            }
            // <rect width="4" height="2" x="17.0" y="26.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 17 26
                moveTo(x = 17.0f, y = 26.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -4z
                horizontalLineToRelative(dx = -4.0f)
                close()
            }
            // <rect width="4" height="2" x="10.0" y="26.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 10 26
                moveTo(x = 10.0f, y = 26.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -4z
                horizontalLineToRelative(dx = -4.0f)
                close()
            }
            // M28 28 h-4 v-2 h4 V4 H7 v4 H5 V4 a2 2 0 0 1 2 -2 h21 a2 2 0 0 1 2 2 v22 a2 2 0 0 1 -2 2
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 28 28
                moveTo(x = 28.0f, y = 28.0f)
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // V 4
                verticalLineTo(y = 4.0f)
                // H 7
                horizontalLineTo(x = 7.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // H 5
                horizontalLineTo(x = 5.0f)
                // V 4
                verticalLineTo(y = 4.0f)
                // a 2 2 0 0 1 2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                )
                // h 21
                horizontalLineToRelative(dx = 21.0f)
                // a 2 2 0 0 1 2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
                // v 22
                verticalLineToRelative(dy = 22.0f)
                // a 2 2 0 0 1 -2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 2.0f,
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
        }.build().also { _cutOut = it }
    }

@Suppress("ObjectPropertyName")
private var _cutOut: ImageVector? = null
