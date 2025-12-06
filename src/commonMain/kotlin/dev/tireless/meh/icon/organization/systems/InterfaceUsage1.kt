package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val InterfaceUsage1: ImageVector
    get() {
        val current = _interfaceUsage1
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.InterfaceUsage1",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M21.03 30 h-10 c-5 0 -9 -4 -9 -9 V11 c0 -5 4 -9 9 -9 h10 c5 0 9 4 9 9 v10 c0 5 -4 9 -9 9 m-10 -26 c-3.9 0 -7 3.1 -7 7 v10 c0 3.9 3.1 7 7 7 h10 c3.9 0 7 -3.1 7 -7 V11 c0 -3.9 -3.1 -7 -7 -7z M9 22 v-1.82 h1.58 v-8.36 H9 V10 h5.45 v1.82 h-1.6 v8.36 h1.6 V22z m7.33 0 v-9 h2.2 v1.52 h.09 a2.5 2.5 0 0 1 2.5 -1.7 c1.85 0 2.88 1.27 2.88 3.5 V22 h-2.2 v-5.45 c0 -1.27 -.43 -1.92 -1.48 -1.92 -.91 0 -1.79 .48 -1.79 1.44 V22z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 21.03 30
                moveTo(x = 21.03f, y = 30.0f)
                // h -10
                horizontalLineToRelative(dx = -10.0f)
                // c -5 0 -9 -4 -9 -9
                curveToRelative(
                    dx1 = -5.0f,
                    dy1 = 0.0f,
                    dx2 = -9.0f,
                    dy2 = -4.0f,
                    dx3 = -9.0f,
                    dy3 = -9.0f,
                )
                // V 11
                verticalLineTo(y = 11.0f)
                // c 0 -5 4 -9 9 -9
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -5.0f,
                    dx2 = 4.0f,
                    dy2 = -9.0f,
                    dx3 = 9.0f,
                    dy3 = -9.0f,
                )
                // h 10
                horizontalLineToRelative(dx = 10.0f)
                // c 5 0 9 4 9 9
                curveToRelative(
                    dx1 = 5.0f,
                    dy1 = 0.0f,
                    dx2 = 9.0f,
                    dy2 = 4.0f,
                    dx3 = 9.0f,
                    dy3 = 9.0f,
                )
                // v 10
                verticalLineToRelative(dy = 10.0f)
                // c 0 5 -4 9 -9 9
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 5.0f,
                    dx2 = -4.0f,
                    dy2 = 9.0f,
                    dx3 = -9.0f,
                    dy3 = 9.0f,
                )
                // m -10 -26
                moveToRelative(dx = -10.0f, dy = -26.0f)
                // c -3.9 0 -7 3.1 -7 7
                curveToRelative(
                    dx1 = -3.9f,
                    dy1 = 0.0f,
                    dx2 = -7.0f,
                    dy2 = 3.1f,
                    dx3 = -7.0f,
                    dy3 = 7.0f,
                )
                // v 10
                verticalLineToRelative(dy = 10.0f)
                // c 0 3.9 3.1 7 7 7
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 3.9f,
                    dx2 = 3.1f,
                    dy2 = 7.0f,
                    dx3 = 7.0f,
                    dy3 = 7.0f,
                )
                // h 10
                horizontalLineToRelative(dx = 10.0f)
                // c 3.9 0 7 -3.1 7 -7
                curveToRelative(
                    dx1 = 3.9f,
                    dy1 = 0.0f,
                    dx2 = 7.0f,
                    dy2 = -3.1f,
                    dx3 = 7.0f,
                    dy3 = -7.0f,
                )
                // V 11
                verticalLineTo(y = 11.0f)
                // c 0 -3.9 -3.1 -7 -7 -7z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -3.9f,
                    dx2 = -3.1f,
                    dy2 = -7.0f,
                    dx3 = -7.0f,
                    dy3 = -7.0f,
                )
                close()
                // M 9 22
                moveTo(x = 9.0f, y = 22.0f)
                // v -1.82
                verticalLineToRelative(dy = -1.82f)
                // h 1.58
                horizontalLineToRelative(dx = 1.58f)
                // v -8.36
                verticalLineToRelative(dy = -8.36f)
                // H 9
                horizontalLineTo(x = 9.0f)
                // V 10
                verticalLineTo(y = 10.0f)
                // h 5.45
                horizontalLineToRelative(dx = 5.45f)
                // v 1.82
                verticalLineToRelative(dy = 1.82f)
                // h -1.6
                horizontalLineToRelative(dx = -1.6f)
                // v 8.36
                verticalLineToRelative(dy = 8.36f)
                // h 1.6
                horizontalLineToRelative(dx = 1.6f)
                // V 22z
                verticalLineTo(y = 22.0f)
                close()
                // m 7.33 0
                moveToRelative(dx = 7.33f, dy = 0.0f)
                // v -9
                verticalLineToRelative(dy = -9.0f)
                // h 2.2
                horizontalLineToRelative(dx = 2.2f)
                // v 1.52
                verticalLineToRelative(dy = 1.52f)
                // h 0.09
                horizontalLineToRelative(dx = 0.09f)
                // a 2.5 2.5 0 0 1 2.5 -1.7
                arcToRelative(
                    a = 2.5f,
                    b = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.5f,
                    dy1 = -1.7f,
                )
                // c 1.85 0 2.88 1.27 2.88 3.5
                curveToRelative(
                    dx1 = 1.85f,
                    dy1 = 0.0f,
                    dx2 = 2.88f,
                    dy2 = 1.27f,
                    dx3 = 2.88f,
                    dy3 = 3.5f,
                )
                // V 22
                verticalLineTo(y = 22.0f)
                // h -2.2
                horizontalLineToRelative(dx = -2.2f)
                // v -5.45
                verticalLineToRelative(dy = -5.45f)
                // c 0 -1.27 -0.43 -1.92 -1.48 -1.92
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.27f,
                    dx2 = -0.43f,
                    dy2 = -1.92f,
                    dx3 = -1.48f,
                    dy3 = -1.92f,
                )
                // c -0.91 0 -1.79 0.48 -1.79 1.44
                curveToRelative(
                    dx1 = -0.91f,
                    dy1 = 0.0f,
                    dx2 = -1.79f,
                    dy2 = 0.48f,
                    dx3 = -1.79f,
                    dy3 = 1.44f,
                )
                // V 22z
                verticalLineTo(y = 22.0f)
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
        }.build().also { _interfaceUsage1 = it }
    }

@Suppress("ObjectPropertyName")
private var _interfaceUsage1: ImageVector? = null
