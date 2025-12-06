package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Copy: ImageVector
    get() {
        val current = _copy
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Copy",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M28 10 v18 H10 V10z m0 -2 H10 a2 2 0 0 0 -2 2 v18 a2 2 0 0 0 2 2 h18 a2 2 0 0 0 2 -2 V10 a2 2 0 0 0 -2 -2
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 28 10
                moveTo(x = 28.0f, y = 10.0f)
                // v 18
                verticalLineToRelative(dy = 18.0f)
                // H 10
                horizontalLineTo(x = 10.0f)
                // V 10z
                verticalLineTo(y = 10.0f)
                close()
                // m 0 -2
                moveToRelative(dx = 0.0f, dy = -2.0f)
                // H 10
                horizontalLineTo(x = 10.0f)
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
                // v 18
                verticalLineToRelative(dy = 18.0f)
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
                // h 18
                horizontalLineToRelative(dx = 18.0f)
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
                // V 10
                verticalLineTo(y = 10.0f)
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
            }
            // M4 18 H2 V4 a2 2 0 0 1 2 -2 h14 v2 H4Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 4 18
                moveTo(x = 4.0f, y = 18.0f)
                // H 2
                horizontalLineTo(x = 2.0f)
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
                // h 14
                horizontalLineToRelative(dx = 14.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // H 4z
                horizontalLineTo(x = 4.0f)
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
        }.build().also { _copy = it }
    }

@Suppress("ObjectPropertyName")
private var _copy: ImageVector? = null
