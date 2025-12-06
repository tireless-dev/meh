package dev.tireless.meh.icon.tools.instruments

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Stethoscope: ImageVector
    get() {
        val current = _stethoscope
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Stethoscope",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M24 2 v2 h2 v6 a4 4 0 0 1 -8 0 V4 h2 V2 h-4 v8 a6 6 0 0 0 5 5.91 V22 a6 6 0 0 1 -12 0 v-6.14 a4 4 0 1 0 -2 0 V22 a8 8 0 0 0 16 0 v-6.09 A6 6 0 0 0 28 10 V2Z M6 12 a2 2 0 1 1 2 2 2 2 0 0 1 -2 -2
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 24 2
                moveTo(x = 24.0f, y = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // a 4 4 0 0 1 -8 0
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -8.0f,
                    dy1 = 0.0f,
                )
                // V 4
                verticalLineTo(y = 4.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // V 2
                verticalLineTo(y = 2.0f)
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // v 8
                verticalLineToRelative(dy = 8.0f)
                // a 6 6 0 0 0 5 5.91
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 5.0f,
                    dy1 = 5.91f,
                )
                // V 22
                verticalLineTo(y = 22.0f)
                // a 6 6 0 0 1 -12 0
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -12.0f,
                    dy1 = 0.0f,
                )
                // v -6.14
                verticalLineToRelative(dy = -6.14f)
                // a 4 4 0 1 0 -2 0
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = 0.0f,
                )
                // V 22
                verticalLineTo(y = 22.0f)
                // a 8 8 0 0 0 16 0
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 16.0f,
                    dy1 = 0.0f,
                )
                // v -6.09
                verticalLineToRelative(dy = -6.09f)
                // A 6 6 0 0 0 28 10
                arcTo(
                    horizontalEllipseRadius = 6.0f,
                    verticalEllipseRadius = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 28.0f,
                    y1 = 10.0f,
                )
                // V 2z
                verticalLineTo(y = 2.0f)
                close()
                // M 6 12
                moveTo(x = 6.0f, y = 12.0f)
                // a 2 2 0 1 1 2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
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
        }.build().also { _stethoscope = it }
    }

@Suppress("ObjectPropertyName")
private var _stethoscope: ImageVector? = null
