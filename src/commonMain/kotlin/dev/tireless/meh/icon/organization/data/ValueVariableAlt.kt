package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ValueVariableAlt: ImageVector
    get() {
        val current = _valueVariableAlt
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.ValueVariableAlt",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M3 15.87 v.27 c1.12 .3 2 1.18 2 2.86 v8 h4 v2 H5 a2 2 0 0 1 -2 -2 v-8 c0 -1.55 -.88 -2 -2 -2 v-2 c1.12 0 2 -.48 2 -2 V5 a2 2 0 0 1 2 -2 h4 v2 H5 v8 c0 1.68 -.88 2.58 -2 2.87 m26 0 v.27 c-1.12 .3 -2 1.18 -2 2.86 v8 h-4 v2 h4 a2 2 0 0 0 2 -2 v-8 c0 -1.55 .88 -2 2 -2 v-2 c-1.12 0 -2 -.48 -2 -2 V5 a2 2 0 0 0 -2 -2 h-4 v2 h4 v8 c0 1.68 .88 2.58 2 2.87 M10.34 21.9 a1.4 1.4 0 0 1 -.98 -.34 A1.3 1.3 0 0 1 9 20.6 a1.3 1.3 0 0 1 .34 -.91 1.2 1.2 0 0 1 .9 -.35 q.52 0 .8 .3 a1.2 1.2 0 0 1 .29 .85 v.06 l.1 .08 a3 3 0 0 0 .63 -.57 12 12 0 0 0 .84 -1.14 37 37 0 0 0 2.04 -3.51 l-.05 -2.78 q0 -1.04 -.55 -1.04 a1.4 1.4 0 0 0 -.73 .28 8 8 0 0 0 -1.07 .95 l-.5 -.49 a10 10 0 0 1 1.81 -1.7 3 3 0 0 1 1.56 -.52 q.9 0 1.32 .65 a4 4 0 0 1 .46 2.12 l.03 1.83 h.16 a35 35 0 0 1 1.24 -2.23 9 9 0 0 1 1.05 -1.41 3 3 0 0 1 .96 -.75 2.4 2.4 0 0 1 1.03 -.21 q.6 0 .98 .34 A1.3 1.3 0 0 1 23 11.4 a1.3 1.3 0 0 1 -.34 .91 1.2 1.2 0 0 1 -.9 .35 1 1 0 0 1 -.8 -.29 q-.3 -.29 -.29 -.8 v-.12 l-.1 -.08 A2 2 0 0 0 20 11.92 a13 13 0 0 0 -.76 1.13 q-.43 .69 -.93 1.63 l-1.05 2.06 .05 2.63 q0 1.05 .55 1.04 .31 0 .73 -.28 a8 8 0 0 0 1.07 -.95 l.5 .49 a14 14 0 0 1 -.96 1.01 q-.45 .42 -.85 .69 c-.4 .27 -.54 .3 -.8 .4 s-.5 .12 -.76 .12 q-.9 0 -1.32 -.65 a4 4 0 0 1 -.46 -2.12 L15 17.29 h-.15 a25 25 0 0 1 -1.26 2.13 11 11 0 0 1 -1.12 1.42 4 4 0 0 1 -1.05 .8 2.4 2.4 0 0 1 -1.07 .25
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 3 15.87
                moveTo(x = 3.0f, y = 15.87f)
                // v 0.27
                verticalLineToRelative(dy = 0.27f)
                // c 1.12 0.3 2 1.18 2 2.86
                curveToRelative(
                    dx1 = 1.12f,
                    dy1 = 0.3f,
                    dx2 = 2.0f,
                    dy2 = 1.18f,
                    dx3 = 2.0f,
                    dy3 = 2.86f,
                )
                // v 8
                verticalLineToRelative(dy = 8.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // H 5
                horizontalLineTo(x = 5.0f)
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
                // v -8
                verticalLineToRelative(dy = -8.0f)
                // c 0 -1.55 -0.88 -2 -2 -2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.55f,
                    dx2 = -0.88f,
                    dy2 = -2.0f,
                    dx3 = -2.0f,
                    dy3 = -2.0f,
                )
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // c 1.12 0 2 -0.48 2 -2
                curveToRelative(
                    dx1 = 1.12f,
                    dy1 = 0.0f,
                    dx2 = 2.0f,
                    dy2 = -0.48f,
                    dx3 = 2.0f,
                    dy3 = -2.0f,
                )
                // V 5
                verticalLineTo(y = 5.0f)
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
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // H 5
                horizontalLineTo(x = 5.0f)
                // v 8
                verticalLineToRelative(dy = 8.0f)
                // c 0 1.68 -0.88 2.58 -2 2.87
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.68f,
                    dx2 = -0.88f,
                    dy2 = 2.58f,
                    dx3 = -2.0f,
                    dy3 = 2.87f,
                )
                // m 26 0
                moveToRelative(dx = 26.0f, dy = 0.0f)
                // v 0.27
                verticalLineToRelative(dy = 0.27f)
                // c -1.12 0.3 -2 1.18 -2 2.86
                curveToRelative(
                    dx1 = -1.12f,
                    dy1 = 0.3f,
                    dx2 = -2.0f,
                    dy2 = 1.18f,
                    dx3 = -2.0f,
                    dy3 = 2.86f,
                )
                // v 8
                verticalLineToRelative(dy = 8.0f)
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
                // v -8
                verticalLineToRelative(dy = -8.0f)
                // c 0 -1.55 0.88 -2 2 -2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.55f,
                    dx2 = 0.88f,
                    dy2 = -2.0f,
                    dx3 = 2.0f,
                    dy3 = -2.0f,
                )
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // c -1.12 0 -2 -0.48 -2 -2
                curveToRelative(
                    dx1 = -1.12f,
                    dy1 = 0.0f,
                    dx2 = -2.0f,
                    dy2 = -0.48f,
                    dx3 = -2.0f,
                    dy3 = -2.0f,
                )
                // V 5
                verticalLineTo(y = 5.0f)
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
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 8
                verticalLineToRelative(dy = 8.0f)
                // c 0 1.68 0.88 2.58 2 2.87
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.68f,
                    dx2 = 0.88f,
                    dy2 = 2.58f,
                    dx3 = 2.0f,
                    dy3 = 2.87f,
                )
                // M 10.34 21.9
                moveTo(x = 10.34f, y = 21.9f)
                // a 1.4 1.4 0 0 1 -0.98 -0.34
                arcToRelative(
                    a = 1.4f,
                    b = 1.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.98f,
                    dy1 = -0.34f,
                )
                // A 1.3 1.3 0 0 1 9 20.6
                arcTo(
                    horizontalEllipseRadius = 1.3f,
                    verticalEllipseRadius = 1.3f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 9.0f,
                    y1 = 20.6f,
                )
                // a 1.3 1.3 0 0 1 0.34 -0.91
                arcToRelative(
                    a = 1.3f,
                    b = 1.3f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.34f,
                    dy1 = -0.91f,
                )
                // a 1.2 1.2 0 0 1 0.9 -0.35
                arcToRelative(
                    a = 1.2f,
                    b = 1.2f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.9f,
                    dy1 = -0.35f,
                )
                // q 0.52 0 0.8 0.3
                quadToRelative(
                    dx1 = 0.52f,
                    dy1 = 0.0f,
                    dx2 = 0.8f,
                    dy2 = 0.3f,
                )
                // a 1.2 1.2 0 0 1 0.29 0.85
                arcToRelative(
                    a = 1.2f,
                    b = 1.2f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.29f,
                    dy1 = 0.85f,
                )
                // v 0.06
                verticalLineToRelative(dy = 0.06f)
                // l 0.1 0.08
                lineToRelative(dx = 0.1f, dy = 0.08f)
                // a 3 3 0 0 0 0.63 -0.57
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.63f,
                    dy1 = -0.57f,
                )
                // a 12 12 0 0 0 0.84 -1.14
                arcToRelative(
                    a = 12.0f,
                    b = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.84f,
                    dy1 = -1.14f,
                )
                // a 37 37 0 0 0 2.04 -3.51
                arcToRelative(
                    a = 37.0f,
                    b = 37.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.04f,
                    dy1 = -3.51f,
                )
                // l -0.05 -2.78
                lineToRelative(dx = -0.05f, dy = -2.78f)
                // q 0 -1.04 -0.55 -1.04
                quadToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.04f,
                    dx2 = -0.55f,
                    dy2 = -1.04f,
                )
                // a 1.4 1.4 0 0 0 -0.73 0.28
                arcToRelative(
                    a = 1.4f,
                    b = 1.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.73f,
                    dy1 = 0.28f,
                )
                // a 8 8 0 0 0 -1.07 0.95
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.07f,
                    dy1 = 0.95f,
                )
                // l -0.5 -0.49
                lineToRelative(dx = -0.5f, dy = -0.49f)
                // a 10 10 0 0 1 1.81 -1.7
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.81f,
                    dy1 = -1.7f,
                )
                // a 3 3 0 0 1 1.56 -0.52
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.56f,
                    dy1 = -0.52f,
                )
                // q 0.9 0 1.32 0.65
                quadToRelative(
                    dx1 = 0.9f,
                    dy1 = 0.0f,
                    dx2 = 1.32f,
                    dy2 = 0.65f,
                )
                // a 4 4 0 0 1 0.46 2.12
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.46f,
                    dy1 = 2.12f,
                )
                // l 0.03 1.83
                lineToRelative(dx = 0.03f, dy = 1.83f)
                // h 0.16
                horizontalLineToRelative(dx = 0.16f)
                // a 35 35 0 0 1 1.24 -2.23
                arcToRelative(
                    a = 35.0f,
                    b = 35.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.24f,
                    dy1 = -2.23f,
                )
                // a 9 9 0 0 1 1.05 -1.41
                arcToRelative(
                    a = 9.0f,
                    b = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.05f,
                    dy1 = -1.41f,
                )
                // a 3 3 0 0 1 0.96 -0.75
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.96f,
                    dy1 = -0.75f,
                )
                // a 2.4 2.4 0 0 1 1.03 -0.21
                arcToRelative(
                    a = 2.4f,
                    b = 2.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.03f,
                    dy1 = -0.21f,
                )
                // q 0.6 0 0.98 0.34
                quadToRelative(
                    dx1 = 0.6f,
                    dy1 = 0.0f,
                    dx2 = 0.98f,
                    dy2 = 0.34f,
                )
                // A 1.3 1.3 0 0 1 23 11.4
                arcTo(
                    horizontalEllipseRadius = 1.3f,
                    verticalEllipseRadius = 1.3f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 23.0f,
                    y1 = 11.4f,
                )
                // a 1.3 1.3 0 0 1 -0.34 0.91
                arcToRelative(
                    a = 1.3f,
                    b = 1.3f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.34f,
                    dy1 = 0.91f,
                )
                // a 1.2 1.2 0 0 1 -0.9 0.35
                arcToRelative(
                    a = 1.2f,
                    b = 1.2f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.9f,
                    dy1 = 0.35f,
                )
                // a 1 1 0 0 1 -0.8 -0.29
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.8f,
                    dy1 = -0.29f,
                )
                // q -0.3 -0.29 -0.29 -0.8
                quadToRelative(
                    dx1 = -0.3f,
                    dy1 = -0.29f,
                    dx2 = -0.29f,
                    dy2 = -0.8f,
                )
                // v -0.12
                verticalLineToRelative(dy = -0.12f)
                // l -0.1 -0.08
                lineToRelative(dx = -0.1f, dy = -0.08f)
                // A 2 2 0 0 0 20 11.92
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 20.0f,
                    y1 = 11.92f,
                )
                // a 13 13 0 0 0 -0.76 1.13
                arcToRelative(
                    a = 13.0f,
                    b = 13.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.76f,
                    dy1 = 1.13f,
                )
                // q -0.43 0.69 -0.93 1.63
                quadToRelative(
                    dx1 = -0.43f,
                    dy1 = 0.69f,
                    dx2 = -0.93f,
                    dy2 = 1.63f,
                )
                // l -1.05 2.06
                lineToRelative(dx = -1.05f, dy = 2.06f)
                // l 0.05 2.63
                lineToRelative(dx = 0.05f, dy = 2.63f)
                // q 0 1.05 0.55 1.04
                quadToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.05f,
                    dx2 = 0.55f,
                    dy2 = 1.04f,
                )
                // q 0.31 0 0.73 -0.28
                quadToRelative(
                    dx1 = 0.31f,
                    dy1 = 0.0f,
                    dx2 = 0.73f,
                    dy2 = -0.28f,
                )
                // a 8 8 0 0 0 1.07 -0.95
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.07f,
                    dy1 = -0.95f,
                )
                // l 0.5 0.49
                lineToRelative(dx = 0.5f, dy = 0.49f)
                // a 14 14 0 0 1 -0.96 1.01
                arcToRelative(
                    a = 14.0f,
                    b = 14.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.96f,
                    dy1 = 1.01f,
                )
                // q -0.45 0.42 -0.85 0.69
                quadToRelative(
                    dx1 = -0.45f,
                    dy1 = 0.42f,
                    dx2 = -0.85f,
                    dy2 = 0.69f,
                )
                // c -0.4 0.27 -0.54 0.3 -0.8 0.4
                curveToRelative(
                    dx1 = -0.4f,
                    dy1 = 0.27f,
                    dx2 = -0.54f,
                    dy2 = 0.3f,
                    dx3 = -0.8f,
                    dy3 = 0.4f,
                )
                // s -0.5 0.12 -0.76 0.12
                reflectiveCurveToRelative(
                    dx1 = -0.5f,
                    dy1 = 0.12f,
                    dx2 = -0.76f,
                    dy2 = 0.12f,
                )
                // q -0.9 0 -1.32 -0.65
                quadToRelative(
                    dx1 = -0.9f,
                    dy1 = 0.0f,
                    dx2 = -1.32f,
                    dy2 = -0.65f,
                )
                // a 4 4 0 0 1 -0.46 -2.12
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.46f,
                    dy1 = -2.12f,
                )
                // L 15 17.29
                lineTo(x = 15.0f, y = 17.29f)
                // h -0.15
                horizontalLineToRelative(dx = -0.15f)
                // a 25 25 0 0 1 -1.26 2.13
                arcToRelative(
                    a = 25.0f,
                    b = 25.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.26f,
                    dy1 = 2.13f,
                )
                // a 11 11 0 0 1 -1.12 1.42
                arcToRelative(
                    a = 11.0f,
                    b = 11.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.12f,
                    dy1 = 1.42f,
                )
                // a 4 4 0 0 1 -1.05 0.8
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.05f,
                    dy1 = 0.8f,
                )
                // a 2.4 2.4 0 0 1 -1.07 0.25
                arcToRelative(
                    a = 2.4f,
                    b = 2.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.07f,
                    dy1 = 0.25f,
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
        }.build().also { _valueVariableAlt = it }
    }

@Suppress("ObjectPropertyName")
private var _valueVariableAlt: ImageVector? = null
