package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ReflectHorizontal: ImageVector
    get() {
        val current = _reflectHorizontal
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.ReflectHorizontal",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // m19.39 15.21 9 -7 A1 1 0 0 1 30 9 v14 a1 1 0 0 1 -1.61 .79 l-9 -7 a1 1 0 0 1 0 -1.58
            path(
                fill = SolidColor(Color(0xFF272425)),
            ) {
                // M 19.39 15.21
                moveTo(x = 19.39f, y = 15.21f)
                // l 9 -7
                lineToRelative(dx = 9.0f, dy = -7.0f)
                // A 1 1 0 0 1 30 9
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 30.0f,
                    y1 = 9.0f,
                )
                // v 14
                verticalLineToRelative(dy = 14.0f)
                // a 1 1 0 0 1 -1.61 0.79
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.61f,
                    dy1 = 0.79f,
                )
                // l -9 -7
                lineToRelative(dx = -9.0f, dy = -7.0f)
                // a 1 1 0 0 1 0 -1.58
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -1.58f,
                )
            }
            // <rect width="2" height="28" x="15.0" y="2.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 17 30
                moveTo(x = 17.0f, y = 30.0f)
                // l -2 0
                lineToRelative(dx = -2.0f, dy = 0.0f)
                // l 0 -28
                lineToRelative(dx = 0.0f, dy = -28.0f)
                // l 2 -0z
                lineToRelative(dx = 2.0f, dy = -0.0f)
                close()
            }
            // M13 16 a1 1 0 0 1 -.39 .79 l-9 7 A1 1 0 0 1 2 23 V9 a1 1 0 0 1 1.61 -.79 l9 7 A1 1 0 0 1 13 16 m-9 4.96 L10.37 16 4 11.04Z
            path(
                fill = SolidColor(Color(0xFF272425)),
            ) {
                // M 13 16
                moveTo(x = 13.0f, y = 16.0f)
                // a 1 1 0 0 1 -0.39 0.79
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.39f,
                    dy1 = 0.79f,
                )
                // l -9 7
                lineToRelative(dx = -9.0f, dy = 7.0f)
                // A 1 1 0 0 1 2 23
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 2.0f,
                    y1 = 23.0f,
                )
                // V 9
                verticalLineTo(y = 9.0f)
                // a 1 1 0 0 1 1.61 -0.79
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.61f,
                    dy1 = -0.79f,
                )
                // l 9 7
                lineToRelative(dx = 9.0f, dy = 7.0f)
                // A 1 1 0 0 1 13 16
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 13.0f,
                    y1 = 16.0f,
                )
                // m -9 4.96
                moveToRelative(dx = -9.0f, dy = 4.96f)
                // L 10.37 16
                lineTo(x = 10.37f, y = 16.0f)
                // L 4 11.04z
                lineTo(x = 4.0f, y = 11.04f)
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
        }.build().also { _reflectHorizontal = it }
    }

@Suppress("ObjectPropertyName")
private var _reflectHorizontal: ImageVector? = null
