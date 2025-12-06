package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ActionDefinition: ImageVector
    get() {
        val current = _actionDefinition
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.ActionDefinition",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M17.98 17.5 c0 -2.88 1.5 -4.69 4.15 -4.69 1.8 0 3 .86 3.52 2.27 l-1.8 .81 a1.7 1.7 0 0 0 -1.72 -1.3 c-1.22 0 -1.84 .85 -1.84 2.11 v1.64 c0 1.25 .61 2.1 1.84 2.1 1.05 0 1.56 -.6 1.89 -1.42 l1.69 .81 c-.59 1.58 -1.85 2.38 -3.58 2.38 -2.65 0 -4.15 -1.83 -4.15 -4.72 M14.62 22 l-.96 -3.06 H9.39 L8.45 22 H6.14 l4.03 -12.01 h2.82 L16.98 22z m-3.06 -9.94 h-.09 l-1.53 4.93 h3.17z
            path(
                strokeLineWidth = 0.0f,
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 17.98 17.5
                moveTo(x = 17.98f, y = 17.5f)
                // c 0 -2.88 1.5 -4.69 4.15 -4.69
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.88f,
                    dx2 = 1.5f,
                    dy2 = -4.69f,
                    dx3 = 4.15f,
                    dy3 = -4.69f,
                )
                // c 1.8 0 3 0.86 3.52 2.27
                curveToRelative(
                    dx1 = 1.8f,
                    dy1 = 0.0f,
                    dx2 = 3.0f,
                    dy2 = 0.86f,
                    dx3 = 3.52f,
                    dy3 = 2.27f,
                )
                // l -1.8 0.81
                lineToRelative(dx = -1.8f, dy = 0.81f)
                // a 1.7 1.7 0 0 0 -1.72 -1.3
                arcToRelative(
                    a = 1.7f,
                    b = 1.7f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.72f,
                    dy1 = -1.3f,
                )
                // c -1.22 0 -1.84 0.85 -1.84 2.11
                curveToRelative(
                    dx1 = -1.22f,
                    dy1 = 0.0f,
                    dx2 = -1.84f,
                    dy2 = 0.85f,
                    dx3 = -1.84f,
                    dy3 = 2.11f,
                )
                // v 1.64
                verticalLineToRelative(dy = 1.64f)
                // c 0 1.25 0.61 2.1 1.84 2.1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.25f,
                    dx2 = 0.61f,
                    dy2 = 2.1f,
                    dx3 = 1.84f,
                    dy3 = 2.1f,
                )
                // c 1.05 0 1.56 -0.6 1.89 -1.42
                curveToRelative(
                    dx1 = 1.05f,
                    dy1 = 0.0f,
                    dx2 = 1.56f,
                    dy2 = -0.6f,
                    dx3 = 1.89f,
                    dy3 = -1.42f,
                )
                // l 1.69 0.81
                lineToRelative(dx = 1.69f, dy = 0.81f)
                // c -0.59 1.58 -1.85 2.38 -3.58 2.38
                curveToRelative(
                    dx1 = -0.59f,
                    dy1 = 1.58f,
                    dx2 = -1.85f,
                    dy2 = 2.38f,
                    dx3 = -3.58f,
                    dy3 = 2.38f,
                )
                // c -2.65 0 -4.15 -1.83 -4.15 -4.72
                curveToRelative(
                    dx1 = -2.65f,
                    dy1 = 0.0f,
                    dx2 = -4.15f,
                    dy2 = -1.83f,
                    dx3 = -4.15f,
                    dy3 = -4.72f,
                )
                // M 14.62 22
                moveTo(x = 14.62f, y = 22.0f)
                // l -0.96 -3.06
                lineToRelative(dx = -0.96f, dy = -3.06f)
                // H 9.39
                horizontalLineTo(x = 9.39f)
                // L 8.45 22
                lineTo(x = 8.45f, y = 22.0f)
                // H 6.14
                horizontalLineTo(x = 6.14f)
                // l 4.03 -12.01
                lineToRelative(dx = 4.03f, dy = -12.01f)
                // h 2.82
                horizontalLineToRelative(dx = 2.82f)
                // L 16.98 22z
                lineTo(x = 16.98f, y = 22.0f)
                close()
                // m -3.06 -9.94
                moveToRelative(dx = -3.06f, dy = -9.94f)
                // h -0.09
                horizontalLineToRelative(dx = -0.09f)
                // l -1.53 4.93
                lineToRelative(dx = -1.53f, dy = 4.93f)
                // h 3.17z
                horizontalLineToRelative(dx = 3.17f)
                close()
            }
            // M28 30 H4 a2 2 0 0 1 -2 -2 V4 a2 2 0 0 1 2 -2 h24 a2 2 0 0 1 2 2 v24 a2 2 0 0 1 -2 2 M4 28 h24 V4 H4z
            path(
                strokeLineWidth = 0.0f,
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 28 30
                moveTo(x = 28.0f, y = 30.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
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
                // h 24
                horizontalLineToRelative(dx = 24.0f)
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
                // v 24
                verticalLineToRelative(dy = 24.0f)
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
                // M 4 28
                moveTo(x = 4.0f, y = 28.0f)
                // h 24
                horizontalLineToRelative(dx = 24.0f)
                // V 4
                verticalLineTo(y = 4.0f)
                // H 4z
                horizontalLineTo(x = 4.0f)
                close()
            }
            // <rect width="32" height="32" fill="#000" style="fill:none;stroke-width:0" stroke-width="0" />
            path(
                fill = SolidColor(Color.Transparent),
                strokeLineWidth = 0.0f,
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
        }.build().also { _actionDefinition = it }
    }

@Suppress("ObjectPropertyName")
private var _actionDefinition: ImageVector? = null
