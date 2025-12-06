package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DatabaseMessaging: ImageVector
    get() {
        val current = _databaseMessaging
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.DatabaseMessaging",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // m23 32 -1.75 -1 L24 27 h4 v-7 H16 v7 h4 v2 h-4 a2 2 0 0 1 -2 -2 v-7 a2 2 0 0 1 2 -2 h12 a2 2 0 0 1 2 2 v7 a2 2 0 0 1 -2 2 h-3z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 23 32
                moveTo(x = 23.0f, y = 32.0f)
                // l -1.75 -1
                lineToRelative(dx = -1.75f, dy = -1.0f)
                // L 24 27
                lineTo(x = 24.0f, y = 27.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v -7
                verticalLineToRelative(dy = -7.0f)
                // H 16
                horizontalLineTo(x = 16.0f)
                // v 7
                verticalLineToRelative(dy = 7.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // a 2 2 0 0 1 -2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
                // v -7
                verticalLineToRelative(dy = -7.0f)
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
                // h 12
                horizontalLineToRelative(dx = 12.0f)
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
                // v 7
                verticalLineToRelative(dy = 7.0f)
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
                // h -3z
                horizontalLineToRelative(dx = -3.0f)
                close()
            }
            // M13 2 C7.7 2 2 3.25 2 6 v18 c0 2.4 4.36 3.66 9 3.94 v-2 C6.47 25.66 4.13 24.47 4 24 v-3.57 c1.7 .85 4.3 1.34 7 1.5 v-2 C6.47 19.67 4.13 18.48 4 18 v-3.57 C6.13 15.49 9.64 16 13 16 c5.3 0 11 -1.25 11 -4 V6 c0 -2.75 -5.7 -4 -11 -4 M4 6.02 C4.15 5.46 7.15 4 13 4 c5.8 0 8.8 1.43 9 2 -.2 .57 -3.2 2 -9 2 -5.85 0 -8.85 -1.46 -9 -1.98 m18 5.97 C21.84 12.54 18.84 14 13 14 s-8.85 -1.46 -9 -2 V8.43 C6.13 9.5 9.64 10 13 10 s6.87 -.5 9 -1.57z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 13 2
                moveTo(x = 13.0f, y = 2.0f)
                // C 7.7 2 2 3.25 2 6
                curveTo(
                    x1 = 7.7f,
                    y1 = 2.0f,
                    x2 = 2.0f,
                    y2 = 3.25f,
                    x3 = 2.0f,
                    y3 = 6.0f,
                )
                // v 18
                verticalLineToRelative(dy = 18.0f)
                // c 0 2.4 4.36 3.66 9 3.94
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.4f,
                    dx2 = 4.36f,
                    dy2 = 3.66f,
                    dx3 = 9.0f,
                    dy3 = 3.94f,
                )
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // C 6.47 25.66 4.13 24.47 4 24
                curveTo(
                    x1 = 6.47f,
                    y1 = 25.66f,
                    x2 = 4.13f,
                    y2 = 24.47f,
                    x3 = 4.0f,
                    y3 = 24.0f,
                )
                // v -3.57
                verticalLineToRelative(dy = -3.57f)
                // c 1.7 0.85 4.3 1.34 7 1.5
                curveToRelative(
                    dx1 = 1.7f,
                    dy1 = 0.85f,
                    dx2 = 4.3f,
                    dy2 = 1.34f,
                    dx3 = 7.0f,
                    dy3 = 1.5f,
                )
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // C 6.47 19.67 4.13 18.48 4 18
                curveTo(
                    x1 = 6.47f,
                    y1 = 19.67f,
                    x2 = 4.13f,
                    y2 = 18.48f,
                    x3 = 4.0f,
                    y3 = 18.0f,
                )
                // v -3.57
                verticalLineToRelative(dy = -3.57f)
                // C 6.13 15.49 9.64 16 13 16
                curveTo(
                    x1 = 6.13f,
                    y1 = 15.49f,
                    x2 = 9.64f,
                    y2 = 16.0f,
                    x3 = 13.0f,
                    y3 = 16.0f,
                )
                // c 5.3 0 11 -1.25 11 -4
                curveToRelative(
                    dx1 = 5.3f,
                    dy1 = 0.0f,
                    dx2 = 11.0f,
                    dy2 = -1.25f,
                    dx3 = 11.0f,
                    dy3 = -4.0f,
                )
                // V 6
                verticalLineTo(y = 6.0f)
                // c 0 -2.75 -5.7 -4 -11 -4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.75f,
                    dx2 = -5.7f,
                    dy2 = -4.0f,
                    dx3 = -11.0f,
                    dy3 = -4.0f,
                )
                // M 4 6.02
                moveTo(x = 4.0f, y = 6.02f)
                // C 4.15 5.46 7.15 4 13 4
                curveTo(
                    x1 = 4.15f,
                    y1 = 5.46f,
                    x2 = 7.15f,
                    y2 = 4.0f,
                    x3 = 13.0f,
                    y3 = 4.0f,
                )
                // c 5.8 0 8.8 1.43 9 2
                curveToRelative(
                    dx1 = 5.8f,
                    dy1 = 0.0f,
                    dx2 = 8.8f,
                    dy2 = 1.43f,
                    dx3 = 9.0f,
                    dy3 = 2.0f,
                )
                // c -0.2 0.57 -3.2 2 -9 2
                curveToRelative(
                    dx1 = -0.2f,
                    dy1 = 0.57f,
                    dx2 = -3.2f,
                    dy2 = 2.0f,
                    dx3 = -9.0f,
                    dy3 = 2.0f,
                )
                // c -5.85 0 -8.85 -1.46 -9 -1.98
                curveToRelative(
                    dx1 = -5.85f,
                    dy1 = 0.0f,
                    dx2 = -8.85f,
                    dy2 = -1.46f,
                    dx3 = -9.0f,
                    dy3 = -1.98f,
                )
                // m 18 5.97
                moveToRelative(dx = 18.0f, dy = 5.97f)
                // C 21.84 12.54 18.84 14 13 14
                curveTo(
                    x1 = 21.84f,
                    y1 = 12.54f,
                    x2 = 18.84f,
                    y2 = 14.0f,
                    x3 = 13.0f,
                    y3 = 14.0f,
                )
                // s -8.85 -1.46 -9 -2
                reflectiveCurveToRelative(
                    dx1 = -8.85f,
                    dy1 = -1.46f,
                    dx2 = -9.0f,
                    dy2 = -2.0f,
                )
                // V 8.43
                verticalLineTo(y = 8.43f)
                // C 6.13 9.5 9.64 10 13 10
                curveTo(
                    x1 = 6.13f,
                    y1 = 9.5f,
                    x2 = 9.64f,
                    y2 = 10.0f,
                    x3 = 13.0f,
                    y3 = 10.0f,
                )
                // s 6.87 -0.5 9 -1.57z
                reflectiveCurveToRelative(
                    dx1 = 6.87f,
                    dy1 = -0.5f,
                    dx2 = 9.0f,
                    dy2 = -1.57f,
                )
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
        }.build().also { _databaseMessaging = it }
    }

@Suppress("ObjectPropertyName")
private var _databaseMessaging: ImageVector? = null
