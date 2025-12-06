package dev.tireless.meh.icon.actions.controls

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SettingsEdit: ImageVector
    get() {
        val current = _settingsEdit
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.SettingsEdit",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // m31.7 19.3 -3 -3 a1 1 0 0 0 -1.4 0 L18 25.58 V30 h4.41 l9.3 -9.3 a1 1 0 0 0 0 -1.4 M21.6 28 H20 v-1.59 l5 -5 L26.59 23z M28 21.59 26.41 20 28 18.41 29.59 20z M16 22 c-3.36 0 -6 -2.64 -6 -6 s2.64 -6 6 -6 6 2.64 6 6 -2.64 6 -6 6 m0 -10 c-2.28 0 -4 1.72 -4 4 s1.72 4 4 4 4 -1.72 4 -4 -1.72 -4 -4 -4
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 31.7 19.3
                moveTo(x = 31.7f, y = 19.3f)
                // l -3 -3
                lineToRelative(dx = -3.0f, dy = -3.0f)
                // a 1 1 0 0 0 -1.4 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.4f,
                    dy1 = 0.0f,
                )
                // L 18 25.58
                lineTo(x = 18.0f, y = 25.58f)
                // V 30
                verticalLineTo(y = 30.0f)
                // h 4.41
                horizontalLineToRelative(dx = 4.41f)
                // l 9.3 -9.3
                lineToRelative(dx = 9.3f, dy = -9.3f)
                // a 1 1 0 0 0 0 -1.4
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = -1.4f,
                )
                // M 21.6 28
                moveTo(x = 21.6f, y = 28.0f)
                // H 20
                horizontalLineTo(x = 20.0f)
                // v -1.59
                verticalLineToRelative(dy = -1.59f)
                // l 5 -5
                lineToRelative(dx = 5.0f, dy = -5.0f)
                // L 26.59 23z
                lineTo(x = 26.59f, y = 23.0f)
                close()
                // M 28 21.59
                moveTo(x = 28.0f, y = 21.59f)
                // L 26.41 20
                lineTo(x = 26.41f, y = 20.0f)
                // L 28 18.41
                lineTo(x = 28.0f, y = 18.41f)
                // L 29.59 20z
                lineTo(x = 29.59f, y = 20.0f)
                close()
                // M 16 22
                moveTo(x = 16.0f, y = 22.0f)
                // c -3.36 0 -6 -2.64 -6 -6
                curveToRelative(
                    dx1 = -3.36f,
                    dy1 = 0.0f,
                    dx2 = -6.0f,
                    dy2 = -2.64f,
                    dx3 = -6.0f,
                    dy3 = -6.0f,
                )
                // s 2.64 -6 6 -6
                reflectiveCurveToRelative(
                    dx1 = 2.64f,
                    dy1 = -6.0f,
                    dx2 = 6.0f,
                    dy2 = -6.0f,
                )
                // s 6 2.64 6 6
                reflectiveCurveToRelative(
                    dx1 = 6.0f,
                    dy1 = 2.64f,
                    dx2 = 6.0f,
                    dy2 = 6.0f,
                )
                // s -2.64 6 -6 6
                reflectiveCurveToRelative(
                    dx1 = -2.64f,
                    dy1 = 6.0f,
                    dx2 = -6.0f,
                    dy2 = 6.0f,
                )
                // m 0 -10
                moveToRelative(dx = 0.0f, dy = -10.0f)
                // c -2.28 0 -4 1.72 -4 4
                curveToRelative(
                    dx1 = -2.28f,
                    dy1 = 0.0f,
                    dx2 = -4.0f,
                    dy2 = 1.72f,
                    dx3 = -4.0f,
                    dy3 = 4.0f,
                )
                // s 1.72 4 4 4
                reflectiveCurveToRelative(
                    dx1 = 1.72f,
                    dy1 = 4.0f,
                    dx2 = 4.0f,
                    dy2 = 4.0f,
                )
                // s 4 -1.72 4 -4
                reflectiveCurveToRelative(
                    dx1 = 4.0f,
                    dy1 = -1.72f,
                    dx2 = 4.0f,
                    dy2 = -4.0f,
                )
                // s -1.72 -4 -4 -4
                reflectiveCurveToRelative(
                    dx1 = -1.72f,
                    dy1 = -4.0f,
                    dx2 = -4.0f,
                    dy2 = -4.0f,
                )
            }
            // m27.55 12 1.73 -1 -2.34 -4.04 a2 2 0 0 0 -2.37 -.9 l-2.43 .82 a11 11 0 0 0 -1.31 -.75 l-.5 -2.52 A2 2 0 0 0 18.35 2 h-4.72 a2 2 0 0 0 -1.96 1.6 l-.5 2.53 a11 11 0 0 0 -1.33 .75 L7.43 6.06 a2 2 0 0 0 -2.37 .9 L2.7 11.04 a2 2 0 0 0 .4 2.5 l1.94 1.7 Q5 15.61 5 16 q0 .39 .03 .77 L3.1 18.45 a2 2 0 0 0 -.41 2.5 l2.36 4.1 a2 2 0 0 0 2.37 .89 l2.43 -.82 a11 11 0 0 0 1.31 .75 l.5 2.52 A2 2 0 0 0 13.65 30 H16 v-2 h-2.36 l-.71 -3.55 a9 9 0 0 1 -2.7 -1.57 L6.8 24.04 l-2.36 -4.08 2.72 -2.4 a9 9 0 0 1 0 -3.13 l-2.72 -2.39 2.36 -4.08 3.43 1.16 a9 9 0 0 1 2.7 -1.57 L13.65 4 h4.72 l.71 3.55 a9 9 0 0 1 2.7 1.57 l3.44 -1.16z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 27.55 12
                moveTo(x = 27.55f, y = 12.0f)
                // l 1.73 -1
                lineToRelative(dx = 1.73f, dy = -1.0f)
                // l -2.34 -4.04
                lineToRelative(dx = -2.34f, dy = -4.04f)
                // a 2 2 0 0 0 -2.37 -0.9
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.37f,
                    dy1 = -0.9f,
                )
                // l -2.43 0.82
                lineToRelative(dx = -2.43f, dy = 0.82f)
                // a 11 11 0 0 0 -1.31 -0.75
                arcToRelative(
                    a = 11.0f,
                    b = 11.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.31f,
                    dy1 = -0.75f,
                )
                // l -0.5 -2.52
                lineToRelative(dx = -0.5f, dy = -2.52f)
                // A 2 2 0 0 0 18.35 2
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 18.35f,
                    y1 = 2.0f,
                )
                // h -4.72
                horizontalLineToRelative(dx = -4.72f)
                // a 2 2 0 0 0 -1.96 1.6
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.96f,
                    dy1 = 1.6f,
                )
                // l -0.5 2.53
                lineToRelative(dx = -0.5f, dy = 2.53f)
                // a 11 11 0 0 0 -1.33 0.75
                arcToRelative(
                    a = 11.0f,
                    b = 11.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.33f,
                    dy1 = 0.75f,
                )
                // L 7.43 6.06
                lineTo(x = 7.43f, y = 6.06f)
                // a 2 2 0 0 0 -2.37 0.9
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.37f,
                    dy1 = 0.9f,
                )
                // L 2.7 11.04
                lineTo(x = 2.7f, y = 11.04f)
                // a 2 2 0 0 0 0.4 2.5
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.4f,
                    dy1 = 2.5f,
                )
                // l 1.94 1.7
                lineToRelative(dx = 1.94f, dy = 1.7f)
                // Q 5 15.61 5 16
                quadTo(
                    x1 = 5.0f,
                    y1 = 15.61f,
                    x2 = 5.0f,
                    y2 = 16.0f,
                )
                // q 0 0.39 0.03 0.77
                quadToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.39f,
                    dx2 = 0.03f,
                    dy2 = 0.77f,
                )
                // L 3.1 18.45
                lineTo(x = 3.1f, y = 18.45f)
                // a 2 2 0 0 0 -0.41 2.5
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.41f,
                    dy1 = 2.5f,
                )
                // l 2.36 4.1
                lineToRelative(dx = 2.36f, dy = 4.1f)
                // a 2 2 0 0 0 2.37 0.89
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.37f,
                    dy1 = 0.89f,
                )
                // l 2.43 -0.82
                lineToRelative(dx = 2.43f, dy = -0.82f)
                // a 11 11 0 0 0 1.31 0.75
                arcToRelative(
                    a = 11.0f,
                    b = 11.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.31f,
                    dy1 = 0.75f,
                )
                // l 0.5 2.52
                lineToRelative(dx = 0.5f, dy = 2.52f)
                // A 2 2 0 0 0 13.65 30
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 13.65f,
                    y1 = 30.0f,
                )
                // H 16
                horizontalLineTo(x = 16.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h -2.36
                horizontalLineToRelative(dx = -2.36f)
                // l -0.71 -3.55
                lineToRelative(dx = -0.71f, dy = -3.55f)
                // a 9 9 0 0 1 -2.7 -1.57
                arcToRelative(
                    a = 9.0f,
                    b = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.7f,
                    dy1 = -1.57f,
                )
                // L 6.8 24.04
                lineTo(x = 6.8f, y = 24.04f)
                // l -2.36 -4.08
                lineToRelative(dx = -2.36f, dy = -4.08f)
                // l 2.72 -2.4
                lineToRelative(dx = 2.72f, dy = -2.4f)
                // a 9 9 0 0 1 0 -3.13
                arcToRelative(
                    a = 9.0f,
                    b = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -3.13f,
                )
                // l -2.72 -2.39
                lineToRelative(dx = -2.72f, dy = -2.39f)
                // l 2.36 -4.08
                lineToRelative(dx = 2.36f, dy = -4.08f)
                // l 3.43 1.16
                lineToRelative(dx = 3.43f, dy = 1.16f)
                // a 9 9 0 0 1 2.7 -1.57
                arcToRelative(
                    a = 9.0f,
                    b = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.7f,
                    dy1 = -1.57f,
                )
                // L 13.65 4
                lineTo(x = 13.65f, y = 4.0f)
                // h 4.72
                horizontalLineToRelative(dx = 4.72f)
                // l 0.71 3.55
                lineToRelative(dx = 0.71f, dy = 3.55f)
                // a 9 9 0 0 1 2.7 1.57
                arcToRelative(
                    a = 9.0f,
                    b = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.7f,
                    dy1 = 1.57f,
                )
                // l 3.44 -1.16z
                lineToRelative(dx = 3.44f, dy = -1.16f)
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
        }.build().also { _settingsEdit = it }
    }

@Suppress("ObjectPropertyName")
private var _settingsEdit: ImageVector? = null
