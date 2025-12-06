package dev.tireless.meh.icon.planning.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Drought: ImageVector
    get() {
        val current = _drought
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Drought",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M27 18 h3 v-3 a4 4 0 0 0 -4 -4 h-1 V9.5 A3.5 3.5 0 0 0 21.5 6 3.5 3.5 0 0 0 20 6.35 V5.41 a3.41 3.41 0 0 0 -6.54 -1.34 L11.34 9 H9 a5 5 0 0 0 -5 5 v4 h4 a5 5 0 0 0 5 -5 v-2.8 l2.3 -5.34 A1.41 1.41 0 0 1 18 5.4 V22 h-3.39 L11 25.3 7.39 22 H2 v2 h4.61 L11 28 l4.39 -4 H30 v-2 H20 V9.5 a1.5 1.5 0 0 1 3 0 V14 a4 4 0 0 0 4 4 m-2 -5 h1 a2 2 0 0 1 2 2 v1 h-1 a2 2 0 0 1 -2 -2Z m-14 0 a3 3 0 0 1 -3 3 H6 v-2 a3 3 0 0 1 3 -3 h2Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 27 18
                moveTo(x = 27.0f, y = 18.0f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // v -3
                verticalLineToRelative(dy = -3.0f)
                // a 4 4 0 0 0 -4 -4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -4.0f,
                    dy1 = -4.0f,
                )
                // h -1
                horizontalLineToRelative(dx = -1.0f)
                // V 9.5
                verticalLineTo(y = 9.5f)
                // A 3.5 3.5 0 0 0 21.5 6
                arcTo(
                    horizontalEllipseRadius = 3.5f,
                    verticalEllipseRadius = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 21.5f,
                    y1 = 6.0f,
                )
                // A 3.5 3.5 0 0 0 20 6.35
                arcTo(
                    horizontalEllipseRadius = 3.5f,
                    verticalEllipseRadius = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 20.0f,
                    y1 = 6.35f,
                )
                // V 5.41
                verticalLineTo(y = 5.41f)
                // a 3.41 3.41 0 0 0 -6.54 -1.34
                arcToRelative(
                    a = 3.41f,
                    b = 3.41f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -6.54f,
                    dy1 = -1.34f,
                )
                // L 11.34 9
                lineTo(x = 11.34f, y = 9.0f)
                // H 9
                horizontalLineTo(x = 9.0f)
                // a 5 5 0 0 0 -5 5
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -5.0f,
                    dy1 = 5.0f,
                )
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // a 5 5 0 0 0 5 -5
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 5.0f,
                    dy1 = -5.0f,
                )
                // v -2.8
                verticalLineToRelative(dy = -2.8f)
                // l 2.3 -5.34
                lineToRelative(dx = 2.3f, dy = -5.34f)
                // A 1.41 1.41 0 0 1 18 5.4
                arcTo(
                    horizontalEllipseRadius = 1.41f,
                    verticalEllipseRadius = 1.41f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 18.0f,
                    y1 = 5.4f,
                )
                // V 22
                verticalLineTo(y = 22.0f)
                // h -3.39
                horizontalLineToRelative(dx = -3.39f)
                // L 11 25.3
                lineTo(x = 11.0f, y = 25.3f)
                // L 7.39 22
                lineTo(x = 7.39f, y = 22.0f)
                // H 2
                horizontalLineTo(x = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 4.61
                horizontalLineToRelative(dx = 4.61f)
                // L 11 28
                lineTo(x = 11.0f, y = 28.0f)
                // l 4.39 -4
                lineToRelative(dx = 4.39f, dy = -4.0f)
                // H 30
                horizontalLineTo(x = 30.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // H 20
                horizontalLineTo(x = 20.0f)
                // V 9.5
                verticalLineTo(y = 9.5f)
                // a 1.5 1.5 0 0 1 3 0
                arcToRelative(
                    a = 1.5f,
                    b = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 3.0f,
                    dy1 = 0.0f,
                )
                // V 14
                verticalLineTo(y = 14.0f)
                // a 4 4 0 0 0 4 4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 4.0f,
                    dy1 = 4.0f,
                )
                // m -2 -5
                moveToRelative(dx = -2.0f, dy = -5.0f)
                // h 1
                horizontalLineToRelative(dx = 1.0f)
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
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // h -1
                horizontalLineToRelative(dx = -1.0f)
                // a 2 2 0 0 1 -2 -2z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
                close()
                // m -14 0
                moveToRelative(dx = -14.0f, dy = 0.0f)
                // a 3 3 0 0 1 -3 3
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -3.0f,
                    dy1 = 3.0f,
                )
                // H 6
                horizontalLineTo(x = 6.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // a 3 3 0 0 1 3 -3
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 3.0f,
                    dy1 = -3.0f,
                )
                // h 2z
                horizontalLineToRelative(dx = 2.0f)
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
        }.build().also { _drought = it }
    }

@Suppress("ObjectPropertyName")
private var _drought: ImageVector? = null
