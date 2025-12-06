package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ClosedCaption: ImageVector
    get() {
        val current = _closedCaption
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.ClosedCaption",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M15 21 h-5 a2 2 0 0 1 -2 -2 v-6 a2 2 0 0 1 2 -2 h5 v2 h-5 v6 h5Z m10 0 h-5 a2 2 0 0 1 -2 -2 v-6 a2 2 0 0 1 2 -2 h5 v2 h-5 v6 h5Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 15 21
                moveTo(x = 15.0f, y = 21.0f)
                // h -5
                horizontalLineToRelative(dx = -5.0f)
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
                // v -6
                verticalLineToRelative(dy = -6.0f)
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
                // h 5
                horizontalLineToRelative(dx = 5.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -5
                horizontalLineToRelative(dx = -5.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // h 5z
                horizontalLineToRelative(dx = 5.0f)
                close()
                // m 10 0
                moveToRelative(dx = 10.0f, dy = 0.0f)
                // h -5
                horizontalLineToRelative(dx = -5.0f)
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
                // v -6
                verticalLineToRelative(dy = -6.0f)
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
                // h 5
                horizontalLineToRelative(dx = 5.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -5
                horizontalLineToRelative(dx = -5.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // h 5z
                horizontalLineToRelative(dx = 5.0f)
                close()
            }
            // M28 26 H4 a2 2 0 0 1 -2 -2 V8 a2 2 0 0 1 2 -2 h24 a2 2 0 0 1 2 2 v16 a2 2 0 0 1 -2 2 M4 8 v16 h24 V8Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 28 26
                moveTo(x = 28.0f, y = 26.0f)
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
                // V 8
                verticalLineTo(y = 8.0f)
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
                // v 16
                verticalLineToRelative(dy = 16.0f)
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
                // M 4 8
                moveTo(x = 4.0f, y = 8.0f)
                // v 16
                verticalLineToRelative(dy = 16.0f)
                // h 24
                horizontalLineToRelative(dx = 24.0f)
                // V 8z
                verticalLineTo(y = 8.0f)
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
        }.build().also { _closedCaption = it }
    }

@Suppress("ObjectPropertyName")
private var _closedCaption: ImageVector? = null
