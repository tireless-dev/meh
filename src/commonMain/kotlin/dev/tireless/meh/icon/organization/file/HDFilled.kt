package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val HDFilled: ImageVector
    get() {
        val current = _hDFilled
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.HDFilled",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M22 13 h-2 v6 h2 a1 1 0 0 0 1 -1 v-4 a1 1 0 0 0 -1 -1
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 22 13
                moveTo(x = 22.0f, y = 13.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // a 1 1 0 0 0 1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.0f,
                    dy1 = -1.0f,
                )
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // a 1 1 0 0 0 -1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.0f,
                    dy1 = -1.0f,
                )
            }
            // M28 6 H4 a2 2 0 0 0 -2 2 v16 a2 2 0 0 0 2 2 h24 a2 2 0 0 0 2 -2 V8 a2 2 0 0 0 -2 -2 M15 21 h-2 v-4 h-3 v4 H8 V11 h2 v4 h3 v-4 h2Z m10 -3 a3 3 0 0 1 -3 3 h-4 V11 h4 a3 3 0 0 1 3 3Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 28 6
                moveTo(x = 28.0f, y = 6.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
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
                // v 16
                verticalLineToRelative(dy = 16.0f)
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
                // h 24
                horizontalLineToRelative(dx = 24.0f)
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
                // M 15 21
                moveTo(x = 15.0f, y = 21.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // h -3
                horizontalLineToRelative(dx = -3.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // H 8
                horizontalLineTo(x = 8.0f)
                // V 11
                verticalLineTo(y = 11.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // h 2z
                horizontalLineToRelative(dx = 2.0f)
                close()
                // m 10 -3
                moveToRelative(dx = 10.0f, dy = -3.0f)
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
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // V 11
                verticalLineTo(y = 11.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // a 3 3 0 0 1 3 3z
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 3.0f,
                    dy1 = 3.0f,
                )
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
        }.build().also { _hDFilled = it }
    }

@Suppress("ObjectPropertyName")
private var _hDFilled: ImageVector? = null
