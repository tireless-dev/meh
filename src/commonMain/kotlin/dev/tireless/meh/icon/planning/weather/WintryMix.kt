package dev.tireless.meh.icon.planning.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val WintryMix: ImageVector
    get() {
        val current = _wintryMix
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.WintryMix",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <rect width="2" height="2" x="15.0" y="26.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 15 26
                moveTo(x = 15.0f, y = 26.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            // <rect width="2" height="2" x="17.0" y="28.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 17 28
                moveTo(x = 17.0f, y = 28.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            // <rect width="2" height="2" x="19.0" y="30.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 19 30
                moveTo(x = 19.0f, y = 30.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            // <rect width="2" height="2" x="19.0" y="26.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 19 26
                moveTo(x = 19.0f, y = 26.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            // <rect width="2" height="2" x="15.0" y="30.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 15 30
                moveTo(x = 15.0f, y = 30.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            // <rect width="2" height="2" x="13.0" y="16.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 13 16
                moveTo(x = 13.0f, y = 16.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            // <rect width="2" height="2" x="15.0" y="18.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 15 18
                moveTo(x = 15.0f, y = 18.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            // <rect width="2" height="2" x="17.0" y="20.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 17 20
                moveTo(x = 17.0f, y = 20.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            // <rect width="2" height="2" x="17.0" y="16.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 17 16
                moveTo(x = 17.0f, y = 16.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            // <rect width="2" height="2" x="13.0" y="20.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 13 20
                moveTo(x = 13.0f, y = 20.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            // M10 30 a1 1 0 0 1 -.9 -1.45 l2 -4 a1 1 0 1 1 1.8 .9 l-2 4 A1 1 0 0 1 10 30
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 10 30
                moveTo(x = 10.0f, y = 30.0f)
                // a 1 1 0 0 1 -0.9 -1.45
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.9f,
                    dy1 = -1.45f,
                )
                // l 2 -4
                lineToRelative(dx = 2.0f, dy = -4.0f)
                // a 1 1 0 1 1 1.8 0.9
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 1.8f,
                    dy1 = 0.9f,
                )
                // l -2 4
                lineToRelative(dx = -2.0f, dy = 4.0f)
                // A 1 1 0 0 1 10 30
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 10.0f,
                    y1 = 30.0f,
                )
            }
            // M24.8 9.14 a9 9 0 0 0 -17.6 0 A6.5 6.5 0 0 0 2 15.5 V22 l1 2 1 -2 v-1.82 a6.5 6.5 0 0 0 3.43 1.72 L6.1 24.55 a1 1 0 1 0 1.78 .9 l2 -4 a1 1 0 0 0 -.44 -1.34 1 1 0 0 0 -.5 -.1 V20 H8.5 a4.5 4.5 0 0 1 -.36 -8.98 l.82 -.06 .1 -.82 a7 7 0 0 1 13.88 0 l.1 .82 .82 .06 A4.5 4.5 0 0 1 23.5 20 h-.54 A1 1 0 0 0 22 21 v3 l1 2 1 -2 v-2.03 a7 7 0 0 0 2 -.47 V26 l1 2 1 -2 v-5.82 a6.49 6.49 0 0 0 -3.2 -11.04
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 24.8 9.14
                moveTo(x = 24.8f, y = 9.14f)
                // a 9 9 0 0 0 -17.6 0
                arcToRelative(
                    a = 9.0f,
                    b = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -17.6f,
                    dy1 = 0.0f,
                )
                // A 6.5 6.5 0 0 0 2 15.5
                arcTo(
                    horizontalEllipseRadius = 6.5f,
                    verticalEllipseRadius = 6.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 2.0f,
                    y1 = 15.5f,
                )
                // V 22
                verticalLineTo(y = 22.0f)
                // l 1 2
                lineToRelative(dx = 1.0f, dy = 2.0f)
                // l 1 -2
                lineToRelative(dx = 1.0f, dy = -2.0f)
                // v -1.82
                verticalLineToRelative(dy = -1.82f)
                // a 6.5 6.5 0 0 0 3.43 1.72
                arcToRelative(
                    a = 6.5f,
                    b = 6.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 3.43f,
                    dy1 = 1.72f,
                )
                // L 6.1 24.55
                lineTo(x = 6.1f, y = 24.55f)
                // a 1 1 0 1 0 1.78 0.9
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 1.78f,
                    dy1 = 0.9f,
                )
                // l 2 -4
                lineToRelative(dx = 2.0f, dy = -4.0f)
                // a 1 1 0 0 0 -0.44 -1.34
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.44f,
                    dy1 = -1.34f,
                )
                // a 1 1 0 0 0 -0.5 -0.1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.5f,
                    dy1 = -0.1f,
                )
                // V 20
                verticalLineTo(y = 20.0f)
                // H 8.5
                horizontalLineTo(x = 8.5f)
                // a 4.5 4.5 0 0 1 -0.36 -8.98
                arcToRelative(
                    a = 4.5f,
                    b = 4.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.36f,
                    dy1 = -8.98f,
                )
                // l 0.82 -0.06
                lineToRelative(dx = 0.82f, dy = -0.06f)
                // l 0.1 -0.82
                lineToRelative(dx = 0.1f, dy = -0.82f)
                // a 7 7 0 0 1 13.88 0
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 13.88f,
                    dy1 = 0.0f,
                )
                // l 0.1 0.82
                lineToRelative(dx = 0.1f, dy = 0.82f)
                // l 0.82 0.06
                lineToRelative(dx = 0.82f, dy = 0.06f)
                // A 4.5 4.5 0 0 1 23.5 20
                arcTo(
                    horizontalEllipseRadius = 4.5f,
                    verticalEllipseRadius = 4.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 23.5f,
                    y1 = 20.0f,
                )
                // h -0.54
                horizontalLineToRelative(dx = -0.54f)
                // A 1 1 0 0 0 22 21
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 22.0f,
                    y1 = 21.0f,
                )
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // l 1 2
                lineToRelative(dx = 1.0f, dy = 2.0f)
                // l 1 -2
                lineToRelative(dx = 1.0f, dy = -2.0f)
                // v -2.03
                verticalLineToRelative(dy = -2.03f)
                // a 7 7 0 0 0 2 -0.47
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = -0.47f,
                )
                // V 26
                verticalLineTo(y = 26.0f)
                // l 1 2
                lineToRelative(dx = 1.0f, dy = 2.0f)
                // l 1 -2
                lineToRelative(dx = 1.0f, dy = -2.0f)
                // v -5.82
                verticalLineToRelative(dy = -5.82f)
                // a 6.49 6.49 0 0 0 -3.2 -11.04
                arcToRelative(
                    a = 6.49f,
                    b = 6.49f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -3.2f,
                    dy1 = -11.04f,
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
        }.build().also { _wintryMix = it }
    }

@Suppress("ObjectPropertyName")
private var _wintryMix: ImageVector? = null
