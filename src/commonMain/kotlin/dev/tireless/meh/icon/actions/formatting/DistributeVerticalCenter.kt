package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DistributeVerticalCenter: ImageVector
    get() {
        val current = _distributeVerticalCenter
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.DistributeVerticalCenter",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M30 21 h-4 v-1 a2 2 0 0 0 -2 -2 H8 a2 2 0 0 0 -2 2 v1 H2 v2 h4 v1 a2 2 0 0 0 2 2 h16 a2 2 0 0 0 2 -2 v-1 h4Z m-6 3 H8 v-4 h16Z m6 -15 h-8 V8 a2 2 0 0 0 -2 -2 h-8 a2 2 0 0 0 -2 2 v1 H2 v2 h8 v1 a2 2 0 0 0 2 2 h8 a2 2 0 0 0 2 -2 v-1 h8Z m-10 3 h-8 V8 h8Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 30 21
                moveTo(x = 30.0f, y = 21.0f)
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // v -1
                verticalLineToRelative(dy = -1.0f)
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
                // H 8
                horizontalLineTo(x = 8.0f)
                // a 2 2 0 0 0 -2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                )
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // H 2
                horizontalLineTo(x = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // a 2 2 0 0 0 2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
                // h 16
                horizontalLineToRelative(dx = 16.0f)
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
                // v -1
                verticalLineToRelative(dy = -1.0f)
                // h 4z
                horizontalLineToRelative(dx = 4.0f)
                close()
                // m -6 3
                moveToRelative(dx = -6.0f, dy = 3.0f)
                // H 8
                horizontalLineTo(x = 8.0f)
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // h 16z
                horizontalLineToRelative(dx = 16.0f)
                close()
                // m 6 -15
                moveToRelative(dx = 6.0f, dy = -15.0f)
                // h -8
                horizontalLineToRelative(dx = -8.0f)
                // V 8
                verticalLineTo(y = 8.0f)
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
                // h -8
                horizontalLineToRelative(dx = -8.0f)
                // a 2 2 0 0 0 -2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                )
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // H 2
                horizontalLineTo(x = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // a 2 2 0 0 0 2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
                // h 8
                horizontalLineToRelative(dx = 8.0f)
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
                // v -1
                verticalLineToRelative(dy = -1.0f)
                // h 8z
                horizontalLineToRelative(dx = 8.0f)
                close()
                // m -10 3
                moveToRelative(dx = -10.0f, dy = 3.0f)
                // h -8
                horizontalLineToRelative(dx = -8.0f)
                // V 8
                verticalLineTo(y = 8.0f)
                // h 8z
                horizontalLineToRelative(dx = 8.0f)
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
        }.build().also { _distributeVerticalCenter = it }
    }

@Suppress("ObjectPropertyName")
private var _distributeVerticalCenter: ImageVector? = null
