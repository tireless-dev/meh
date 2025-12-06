package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FingerprintRecognition: ImageVector
    get() {
        val current = _fingerprintRecognition
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.FingerprintRecognition",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M7 5.21 a.77 .77 0 0 1 -.46 -1.38 A15.5 15.5 0 0 1 16 1 c2.66 0 6.48 .45 9.5 2.62 a.77 .77 0 0 1 .18 1.07 .8 .8 0 0 1 -1.08 .17 A15 15 0 0 0 16 2.53 a14 14 0 0 0 -8.5 2.52 A.7 .7 0 0 1 7 5.21
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 7 5.21
                moveTo(x = 7.0f, y = 5.21f)
                // a 0.77 0.77 0 0 1 -0.46 -1.38
                arcToRelative(
                    a = 0.77f,
                    b = 0.77f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.46f,
                    dy1 = -1.38f,
                )
                // A 15.5 15.5 0 0 1 16 1
                arcTo(
                    horizontalEllipseRadius = 15.5f,
                    verticalEllipseRadius = 15.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 16.0f,
                    y1 = 1.0f,
                )
                // c 2.66 0 6.48 0.45 9.5 2.62
                curveToRelative(
                    dx1 = 2.66f,
                    dy1 = 0.0f,
                    dx2 = 6.48f,
                    dy2 = 0.45f,
                    dx3 = 9.5f,
                    dy3 = 2.62f,
                )
                // a 0.77 0.77 0 0 1 0.18 1.07
                arcToRelative(
                    a = 0.77f,
                    b = 0.77f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.18f,
                    dy1 = 1.07f,
                )
                // a 0.8 0.8 0 0 1 -1.08 0.17
                arcToRelative(
                    a = 0.8f,
                    b = 0.8f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.08f,
                    dy1 = 0.17f,
                )
                // A 15 15 0 0 0 16 2.53
                arcTo(
                    horizontalEllipseRadius = 15.0f,
                    verticalEllipseRadius = 15.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 16.0f,
                    y1 = 2.53f,
                )
                // a 14 14 0 0 0 -8.5 2.52
                arcToRelative(
                    a = 14.0f,
                    b = 14.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -8.5f,
                    dy1 = 2.52f,
                )
                // A 0.7 0.7 0 0 1 7 5.21
                arcTo(
                    horizontalEllipseRadius = 0.7f,
                    verticalEllipseRadius = 0.7f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 7.0f,
                    y1 = 5.21f,
                )
            }
            // M28.23 12.26 a.8 .8 0 0 1 -.63 -.33 C25.87 9.49 22.78 6.24 16 6.24 a14 14 0 0 0 -11.63 5.7 .77 .77 0 0 1 -1.07 .17 A.76 .76 0 0 1 3.15 11 15.5 15.5 0 0 1 16 4.71 c5.61 0 9.81 2.08 12.84 6.34 a.77 .77 0 0 1 -.19 1.07 1 1 0 0 1 -.42 .14
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 28.23 12.26
                moveTo(x = 28.23f, y = 12.26f)
                // a 0.8 0.8 0 0 1 -0.63 -0.33
                arcToRelative(
                    a = 0.8f,
                    b = 0.8f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.63f,
                    dy1 = -0.33f,
                )
                // C 25.87 9.49 22.78 6.24 16 6.24
                curveTo(
                    x1 = 25.87f,
                    y1 = 9.49f,
                    x2 = 22.78f,
                    y2 = 6.24f,
                    x3 = 16.0f,
                    y3 = 6.24f,
                )
                // a 14 14 0 0 0 -11.63 5.7
                arcToRelative(
                    a = 14.0f,
                    b = 14.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -11.63f,
                    dy1 = 5.7f,
                )
                // a 0.77 0.77 0 0 1 -1.07 0.17
                arcToRelative(
                    a = 0.77f,
                    b = 0.77f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.07f,
                    dy1 = 0.17f,
                )
                // A 0.76 0.76 0 0 1 3.15 11
                arcTo(
                    horizontalEllipseRadius = 0.76f,
                    verticalEllipseRadius = 0.76f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 3.15f,
                    y1 = 11.0f,
                )
                // A 15.5 15.5 0 0 1 16 4.71
                arcTo(
                    horizontalEllipseRadius = 15.5f,
                    verticalEllipseRadius = 15.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 16.0f,
                    y1 = 4.71f,
                )
                // c 5.61 0 9.81 2.08 12.84 6.34
                curveToRelative(
                    dx1 = 5.61f,
                    dy1 = 0.0f,
                    dx2 = 9.81f,
                    dy2 = 2.08f,
                    dx3 = 12.84f,
                    dy3 = 6.34f,
                )
                // a 0.77 0.77 0 0 1 -0.19 1.07
                arcToRelative(
                    a = 0.77f,
                    b = 0.77f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.19f,
                    dy1 = 1.07f,
                )
                // a 1 1 0 0 1 -0.42 0.14
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.42f,
                    dy1 = 0.14f,
                )
            }
            // M12.28 31 a.8 .8 0 0 1 -.72 -.49 .75 .75 0 0 1 .44 -1 c4.37 -1.68 7 -5.12 7 -9.21 a2.8 2.8 0 0 0 -3 -3 c-1.86 0 -2.76 1 -3 3.35 a4.27 4.27 0 0 1 -4.52 3.83 4.27 4.27 0 0 1 -4.32 -4.59 A11.7 11.7 0 0 1 16 8.39 a12 12 0 0 1 12 11.93 19 19 0 0 1 -1.39 6.5 .8 .8 0 0 1 -1 .41 .76 .76 0 0 1 -.41 -1 17 17 0 0 0 1.27 -5.91 A10.45 10.45 0 0 0 16 9.92 a10.2 10.2 0 0 0 -10.38 10 2.77 2.77 0 0 0 2.79 3.06 2.74 2.74 0 0 0 3 -2.48 q.55 -4.68 4.56 -4.69 a4.3 4.3 0 0 1 4.52 4.56 c0 4.74 -3 8.72 -8 10.63z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 12.28 31
                moveTo(x = 12.28f, y = 31.0f)
                // a 0.8 0.8 0 0 1 -0.72 -0.49
                arcToRelative(
                    a = 0.8f,
                    b = 0.8f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.72f,
                    dy1 = -0.49f,
                )
                // a 0.75 0.75 0 0 1 0.44 -1
                arcToRelative(
                    a = 0.75f,
                    b = 0.75f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.44f,
                    dy1 = -1.0f,
                )
                // c 4.37 -1.68 7 -5.12 7 -9.21
                curveToRelative(
                    dx1 = 4.37f,
                    dy1 = -1.68f,
                    dx2 = 7.0f,
                    dy2 = -5.12f,
                    dx3 = 7.0f,
                    dy3 = -9.21f,
                )
                // a 2.8 2.8 0 0 0 -3 -3
                arcToRelative(
                    a = 2.8f,
                    b = 2.8f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -3.0f,
                    dy1 = -3.0f,
                )
                // c -1.86 0 -2.76 1 -3 3.35
                curveToRelative(
                    dx1 = -1.86f,
                    dy1 = 0.0f,
                    dx2 = -2.76f,
                    dy2 = 1.0f,
                    dx3 = -3.0f,
                    dy3 = 3.35f,
                )
                // a 4.27 4.27 0 0 1 -4.52 3.83
                arcToRelative(
                    a = 4.27f,
                    b = 4.27f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -4.52f,
                    dy1 = 3.83f,
                )
                // a 4.27 4.27 0 0 1 -4.32 -4.59
                arcToRelative(
                    a = 4.27f,
                    b = 4.27f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -4.32f,
                    dy1 = -4.59f,
                )
                // A 11.7 11.7 0 0 1 16 8.39
                arcTo(
                    horizontalEllipseRadius = 11.7f,
                    verticalEllipseRadius = 11.7f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 16.0f,
                    y1 = 8.39f,
                )
                // a 12 12 0 0 1 12 11.93
                arcToRelative(
                    a = 12.0f,
                    b = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 12.0f,
                    dy1 = 11.93f,
                )
                // a 19 19 0 0 1 -1.39 6.5
                arcToRelative(
                    a = 19.0f,
                    b = 19.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.39f,
                    dy1 = 6.5f,
                )
                // a 0.8 0.8 0 0 1 -1 0.41
                arcToRelative(
                    a = 0.8f,
                    b = 0.8f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.0f,
                    dy1 = 0.41f,
                )
                // a 0.76 0.76 0 0 1 -0.41 -1
                arcToRelative(
                    a = 0.76f,
                    b = 0.76f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.41f,
                    dy1 = -1.0f,
                )
                // a 17 17 0 0 0 1.27 -5.91
                arcToRelative(
                    a = 17.0f,
                    b = 17.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.27f,
                    dy1 = -5.91f,
                )
                // A 10.45 10.45 0 0 0 16 9.92
                arcTo(
                    horizontalEllipseRadius = 10.45f,
                    verticalEllipseRadius = 10.45f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 16.0f,
                    y1 = 9.92f,
                )
                // a 10.2 10.2 0 0 0 -10.38 10
                arcToRelative(
                    a = 10.2f,
                    b = 10.2f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -10.38f,
                    dy1 = 10.0f,
                )
                // a 2.77 2.77 0 0 0 2.79 3.06
                arcToRelative(
                    a = 2.77f,
                    b = 2.77f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.79f,
                    dy1 = 3.06f,
                )
                // a 2.74 2.74 0 0 0 3 -2.48
                arcToRelative(
                    a = 2.74f,
                    b = 2.74f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 3.0f,
                    dy1 = -2.48f,
                )
                // q 0.55 -4.68 4.56 -4.69
                quadToRelative(
                    dx1 = 0.55f,
                    dy1 = -4.68f,
                    dx2 = 4.56f,
                    dy2 = -4.69f,
                )
                // a 4.3 4.3 0 0 1 4.52 4.56
                arcToRelative(
                    a = 4.3f,
                    b = 4.3f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 4.52f,
                    dy1 = 4.56f,
                )
                // c 0 4.74 -3 8.72 -8 10.63z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 4.74f,
                    dx2 = -3.0f,
                    dy2 = 8.72f,
                    dx3 = -8.0f,
                    dy3 = 10.63f,
                )
                close()
            }
            // M19.77 30.28 a1 1 0 0 1 -.52 -.2 .76 .76 0 0 1 0 -1.08 12.6 12.6 0 0 0 3.54 -8.68 c0 -1.56 -.48 -6.65 -6.7 -6.65 a6.8 6.8 0 0 0 -4.94 1.87 A6.2 6.2 0 0 0 9.32 20 a.77 .77 0 0 1 -.77 .76 A.76 .76 0 0 1 7.78 20 7.7 7.7 0 0 1 10 14.46 a8.3 8.3 0 0 1 6 -2.32 c6.08 0 8.24 4.4 8.24 8.18 a14 14 0 0 1 -3.9 9.68 .8 .8 0 0 1 -.57 .28
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 19.77 30.28
                moveTo(x = 19.77f, y = 30.28f)
                // a 1 1 0 0 1 -0.52 -0.2
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.52f,
                    dy1 = -0.2f,
                )
                // a 0.76 0.76 0 0 1 0 -1.08
                arcToRelative(
                    a = 0.76f,
                    b = 0.76f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -1.08f,
                )
                // a 12.6 12.6 0 0 0 3.54 -8.68
                arcToRelative(
                    a = 12.6f,
                    b = 12.6f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 3.54f,
                    dy1 = -8.68f,
                )
                // c 0 -1.56 -0.48 -6.65 -6.7 -6.65
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.56f,
                    dx2 = -0.48f,
                    dy2 = -6.65f,
                    dx3 = -6.7f,
                    dy3 = -6.65f,
                )
                // a 6.8 6.8 0 0 0 -4.94 1.87
                arcToRelative(
                    a = 6.8f,
                    b = 6.8f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -4.94f,
                    dy1 = 1.87f,
                )
                // A 6.2 6.2 0 0 0 9.32 20
                arcTo(
                    horizontalEllipseRadius = 6.2f,
                    verticalEllipseRadius = 6.2f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 9.32f,
                    y1 = 20.0f,
                )
                // a 0.77 0.77 0 0 1 -0.77 0.76
                arcToRelative(
                    a = 0.77f,
                    b = 0.77f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.77f,
                    dy1 = 0.76f,
                )
                // A 0.76 0.76 0 0 1 7.78 20
                arcTo(
                    horizontalEllipseRadius = 0.76f,
                    verticalEllipseRadius = 0.76f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 7.78f,
                    y1 = 20.0f,
                )
                // A 7.7 7.7 0 0 1 10 14.46
                arcTo(
                    horizontalEllipseRadius = 7.7f,
                    verticalEllipseRadius = 7.7f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 10.0f,
                    y1 = 14.46f,
                )
                // a 8.3 8.3 0 0 1 6 -2.32
                arcToRelative(
                    a = 8.3f,
                    b = 8.3f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 6.0f,
                    dy1 = -2.32f,
                )
                // c 6.08 0 8.24 4.4 8.24 8.18
                curveToRelative(
                    dx1 = 6.08f,
                    dy1 = 0.0f,
                    dx2 = 8.24f,
                    dy2 = 4.4f,
                    dx3 = 8.24f,
                    dy3 = 8.18f,
                )
                // a 14 14 0 0 1 -3.9 9.68
                arcToRelative(
                    a = 14.0f,
                    b = 14.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -3.9f,
                    dy1 = 9.68f,
                )
                // a 0.8 0.8 0 0 1 -0.57 0.28
                arcToRelative(
                    a = 0.8f,
                    b = 0.8f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.57f,
                    dy1 = 0.28f,
                )
            }
            // M8.66 27.74 a14 14 0 0 1 -1.56 -.09 .76 .76 0 1 1 .17 -1.52 q3.75 .42 5.84 -1.32 a6.4 6.4 0 0 0 2.12 -4.53 .75 .75 0 0 1 .82 -.71 .8 .8 0 0 1 .72 .81 A8 8 0 0 1 14.09 26 a8.2 8.2 0 0 1 -5.43 1.74
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 8.66 27.74
                moveTo(x = 8.66f, y = 27.74f)
                // a 14 14 0 0 1 -1.56 -0.09
                arcToRelative(
                    a = 14.0f,
                    b = 14.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.56f,
                    dy1 = -0.09f,
                )
                // a 0.76 0.76 0 1 1 0.17 -1.52
                arcToRelative(
                    a = 0.76f,
                    b = 0.76f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 0.17f,
                    dy1 = -1.52f,
                )
                // q 3.75 0.42 5.84 -1.32
                quadToRelative(
                    dx1 = 3.75f,
                    dy1 = 0.42f,
                    dx2 = 5.84f,
                    dy2 = -1.32f,
                )
                // a 6.4 6.4 0 0 0 2.12 -4.53
                arcToRelative(
                    a = 6.4f,
                    b = 6.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.12f,
                    dy1 = -4.53f,
                )
                // a 0.75 0.75 0 0 1 0.82 -0.71
                arcToRelative(
                    a = 0.75f,
                    b = 0.75f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.82f,
                    dy1 = -0.71f,
                )
                // a 0.8 0.8 0 0 1 0.72 0.81
                arcToRelative(
                    a = 0.8f,
                    b = 0.8f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.72f,
                    dy1 = 0.81f,
                )
                // A 8 8 0 0 1 14.09 26
                arcTo(
                    horizontalEllipseRadius = 8.0f,
                    verticalEllipseRadius = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 14.09f,
                    y1 = 26.0f,
                )
                // a 8.2 8.2 0 0 1 -5.43 1.74
                arcToRelative(
                    a = 8.2f,
                    b = 8.2f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -5.43f,
                    dy1 = 1.74f,
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
        }.build().also { _fingerprintRecognition = it }
    }

@Suppress("ObjectPropertyName")
private var _fingerprintRecognition: ImageVector? = null
