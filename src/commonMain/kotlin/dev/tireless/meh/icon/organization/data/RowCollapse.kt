package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val RowCollapse: ImageVector
    get() {
        val current = _rowCollapse
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.RowCollapse",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M26 20 H6 a2 2 0 0 0 -2 2 v4 a2 2 0 0 0 2 2 h20 a2 2 0 0 0 2 -2 v-4 a2 2 0 0 0 -2 -2 m0 6 H6 v-4 h20Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 26 20
                moveTo(x = 26.0f, y = 20.0f)
                // H 6
                horizontalLineTo(x = 6.0f)
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
                // h 20
                horizontalLineToRelative(dx = 20.0f)
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
                // m 0 6
                moveToRelative(dx = 0.0f, dy = 6.0f)
                // H 6
                horizontalLineTo(x = 6.0f)
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // h 20z
                horizontalLineToRelative(dx = 20.0f)
                close()
            }
            // <polygon points="17.0 7.828 19.586 10.414 21.0 9.0 16.0 4.0 11.0 9.0 12.414 10.414 15.0 7.828 15.0 14.0 4.0 14.0 4.0 16.0 28.0 16.0 28.0 14.0 17.0 14.0 17.0 7.828" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 17 7.828
                moveTo(x = 17.0f, y = 7.828f)
                // L 19.586 10.414
                lineTo(x = 19.586f, y = 10.414f)
                // L 21 9
                lineTo(x = 21.0f, y = 9.0f)
                // L 16 4
                lineTo(x = 16.0f, y = 4.0f)
                // L 11 9
                lineTo(x = 11.0f, y = 9.0f)
                // L 12.414 10.414
                lineTo(x = 12.414f, y = 10.414f)
                // L 15 7.828
                lineTo(x = 15.0f, y = 7.828f)
                // L 15 14
                lineTo(x = 15.0f, y = 14.0f)
                // L 4 14
                lineTo(x = 4.0f, y = 14.0f)
                // L 4 16
                lineTo(x = 4.0f, y = 16.0f)
                // L 28 16
                lineTo(x = 28.0f, y = 16.0f)
                // L 28 14
                lineTo(x = 28.0f, y = 14.0f)
                // L 17 14
                lineTo(x = 17.0f, y = 14.0f)
                // L 17 7.828z
                lineTo(x = 17.0f, y = 7.828f)
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
        }.build().also { _rowCollapse = it }
    }

@Suppress("ObjectPropertyName")
private var _rowCollapse: ImageVector? = null
