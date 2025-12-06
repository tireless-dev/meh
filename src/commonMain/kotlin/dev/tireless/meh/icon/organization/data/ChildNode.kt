package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ChildNode: ImageVector
    get() {
        val current = _childNode
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.ChildNode",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M23 20 a5 5 0 0 0 -4.9 4 H14 a4 4 0 0 1 -4 -4 v-8.1 a5 5 0 1 0 -2 0 V20 a6 6 0 0 0 6 6 h4.1 a5 5 0 1 0 4.9 -6 M6 7 c0 -1.65 1.35 -3 3 -3 s3 1.35 3 3 -1.35 3 -3 3 -3 -1.35 -3 -3
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 23 20
                moveTo(x = 23.0f, y = 20.0f)
                // a 5 5 0 0 0 -4.9 4
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -4.9f,
                    dy1 = 4.0f,
                )
                // H 14
                horizontalLineTo(x = 14.0f)
                // a 4 4 0 0 1 -4 -4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = -4.0f,
                )
                // v -8.1
                verticalLineToRelative(dy = -8.1f)
                // a 5 5 0 1 0 -2 0
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = 0.0f,
                )
                // V 20
                verticalLineTo(y = 20.0f)
                // a 6 6 0 0 0 6 6
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 6.0f,
                    dy1 = 6.0f,
                )
                // h 4.1
                horizontalLineToRelative(dx = 4.1f)
                // a 5 5 0 1 0 4.9 -6
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 4.9f,
                    dy1 = -6.0f,
                )
                // M 6 7
                moveTo(x = 6.0f, y = 7.0f)
                // c 0 -1.65 1.35 -3 3 -3
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.65f,
                    dx2 = 1.35f,
                    dy2 = -3.0f,
                    dx3 = 3.0f,
                    dy3 = -3.0f,
                )
                // s 3 1.35 3 3
                reflectiveCurveToRelative(
                    dx1 = 3.0f,
                    dy1 = 1.35f,
                    dx2 = 3.0f,
                    dy2 = 3.0f,
                )
                // s -1.35 3 -3 3
                reflectiveCurveToRelative(
                    dx1 = -1.35f,
                    dy1 = 3.0f,
                    dx2 = -3.0f,
                    dy2 = 3.0f,
                )
                // s -3 -1.35 -3 -3
                reflectiveCurveToRelative(
                    dx1 = -3.0f,
                    dy1 = -1.35f,
                    dx2 = -3.0f,
                    dy2 = -3.0f,
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
        }.build().also { _childNode = it }
    }

@Suppress("ObjectPropertyName")
private var _childNode: ImageVector? = null
