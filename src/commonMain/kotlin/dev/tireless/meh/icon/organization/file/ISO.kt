package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ISO: ImageVector
    get() {
        val current = _iSO
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.ISO",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M28 23 h-4 a2 2 0 0 1 -2 -2 V11 a2 2 0 0 1 2 -2 h4 a2 2 0 0 1 2 2 v10 a2 2 0 0 1 -2 2 m-4 -12 v10 h4 V11Z m-6 12 h-6 v-2 h6 v-4 h-4 a2 2 0 0 1 -2 -2 v-4 a2 2 0 0 1 2 -2 h6 v2 h-6 v4 h4 a2 2 0 0 1 2 2 v4 a2 2 0 0 1 -2 2
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 28 23
                moveTo(x = 28.0f, y = 23.0f)
                // h -4
                horizontalLineToRelative(dx = -4.0f)
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
                // V 11
                verticalLineTo(y = 11.0f)
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
                // h 4
                horizontalLineToRelative(dx = 4.0f)
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
                // v 10
                verticalLineToRelative(dy = 10.0f)
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
                // m -4 -12
                moveToRelative(dx = -4.0f, dy = -12.0f)
                // v 10
                verticalLineToRelative(dy = 10.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // V 11z
                verticalLineTo(y = 11.0f)
                close()
                // m -6 12
                moveToRelative(dx = -6.0f, dy = 12.0f)
                // h -6
                horizontalLineToRelative(dx = -6.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // h -4
                horizontalLineToRelative(dx = -4.0f)
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
                // v -4
                verticalLineToRelative(dy = -4.0f)
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
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -6
                horizontalLineToRelative(dx = -6.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
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
                // v 4
                verticalLineToRelative(dy = 4.0f)
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
            }
            // <polygon points="2.0 11.0 5.0 11.0 5.0 21.0 2.0 21.0 2.0 23.0 10.0 23.0 10.0 21.0 7.0 21.0 7.0 11.0 10.0 11.0 10.0 9.0 2.0 9.0 2.0 11.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 2 11
                moveTo(x = 2.0f, y = 11.0f)
                // L 5 11
                lineTo(x = 5.0f, y = 11.0f)
                // L 5 21
                lineTo(x = 5.0f, y = 21.0f)
                // L 2 21
                lineTo(x = 2.0f, y = 21.0f)
                // L 2 23
                lineTo(x = 2.0f, y = 23.0f)
                // L 10 23
                lineTo(x = 10.0f, y = 23.0f)
                // L 10 21
                lineTo(x = 10.0f, y = 21.0f)
                // L 7 21
                lineTo(x = 7.0f, y = 21.0f)
                // L 7 11
                lineTo(x = 7.0f, y = 11.0f)
                // L 10 11
                lineTo(x = 10.0f, y = 11.0f)
                // L 10 9
                lineTo(x = 10.0f, y = 9.0f)
                // L 2 9
                lineTo(x = 2.0f, y = 9.0f)
                // L 2 11z
                lineTo(x = 2.0f, y = 11.0f)
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
        }.build().also { _iSO = it }
    }

@Suppress("ObjectPropertyName")
private var _iSO: ImageVector? = null
