package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CategoryNew: ImageVector
    get() {
        val current = _categoryNew
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.CategoryNew",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <polygon points="21.0 10.0 17.0 10.0 17.0 6.0 15.0 6.0 15.0 10.0 11.0 10.0 11.0 12.0 15.0 12.0 15.0 16.0 17.0 16.0 17.0 12.0 21.0 12.0 21.0 10.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 21 10
                moveTo(x = 21.0f, y = 10.0f)
                // L 17 10
                lineTo(x = 17.0f, y = 10.0f)
                // L 17 6
                lineTo(x = 17.0f, y = 6.0f)
                // L 15 6
                lineTo(x = 15.0f, y = 6.0f)
                // L 15 10
                lineTo(x = 15.0f, y = 10.0f)
                // L 11 10
                lineTo(x = 11.0f, y = 10.0f)
                // L 11 12
                lineTo(x = 11.0f, y = 12.0f)
                // L 15 12
                lineTo(x = 15.0f, y = 12.0f)
                // L 15 16
                lineTo(x = 15.0f, y = 16.0f)
                // L 17 16
                lineTo(x = 17.0f, y = 16.0f)
                // L 17 12
                lineTo(x = 17.0f, y = 12.0f)
                // L 21 12
                lineTo(x = 21.0f, y = 12.0f)
                // L 21 10z
                lineTo(x = 21.0f, y = 10.0f)
                close()
            }
            // M28 24 H17 v-4 h6 a2 2 0 0 0 2 -2 V4 a2 2 0 0 0 -2 -2 H9 a2 2 0 0 0 -2 2 v14 a2 2 0 0 0 2 2 h6 v4 H4 a2 2 0 0 0 -2 2 v4 h2 v-4 h11 v4 h2 v-4 h11 v4 h2 v-4 a2 2 0 0 0 -2 -2 M9 4 h14 v14 H9Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 28 24
                moveTo(x = 28.0f, y = 24.0f)
                // H 17
                horizontalLineTo(x = 17.0f)
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
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
                // V 4
                verticalLineTo(y = 4.0f)
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
                // H 9
                horizontalLineTo(x = 9.0f)
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
                // v 14
                verticalLineToRelative(dy = 14.0f)
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
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
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
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // h 11
                horizontalLineToRelative(dx = 11.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // h 11
                horizontalLineToRelative(dx = 11.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v -4
                verticalLineToRelative(dy = -4.0f)
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
                // M 9 4
                moveTo(x = 9.0f, y = 4.0f)
                // h 14
                horizontalLineToRelative(dx = 14.0f)
                // v 14
                verticalLineToRelative(dy = 14.0f)
                // H 9z
                horizontalLineTo(x = 9.0f)
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
        }.build().also { _categoryNew = it }
    }

@Suppress("ObjectPropertyName")
private var _categoryNew: ImageVector? = null
