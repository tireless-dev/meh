package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ZSystems: ImageVector
    get() {
        val current = _zSystems
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.ZSystems",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M27 3 h-8 a2 2 0 0 0 -2 2 v22 a2 2 0 0 0 2 2 h8 a2 2 0 0 0 2 -2 V5 a2 2 0 0 0 -2 -2 m0 6.92 L20.85 5 H27z M26.4 12 19 17.92 V6.08z m.6 2.08 v11.84 L19.6 20z m-8 8 L25.15 27 H19z M13 3 H5 a2 2 0 0 0 -2 2 v22 a2 2 0 0 0 2 2 h8 a2 2 0 0 0 2 -2 V5 a2 2 0 0 0 -2 -2 m0 6.92 L6.85 5 H13z M12.4 12 5 17.92 V6.08z m.6 2.08 v11.84 L5.6 20z m-8 8 L11.15 27 H5z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 27 3
                moveTo(x = 27.0f, y = 3.0f)
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
                // v 22
                verticalLineToRelative(dy = 22.0f)
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
                // V 5
                verticalLineTo(y = 5.0f)
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
                // m 0 6.92
                moveToRelative(dx = 0.0f, dy = 6.92f)
                // L 20.85 5
                lineTo(x = 20.85f, y = 5.0f)
                // H 27z
                horizontalLineTo(x = 27.0f)
                close()
                // M 26.4 12
                moveTo(x = 26.4f, y = 12.0f)
                // L 19 17.92
                lineTo(x = 19.0f, y = 17.92f)
                // V 6.08z
                verticalLineTo(y = 6.08f)
                close()
                // m 0.6 2.08
                moveToRelative(dx = 0.6f, dy = 2.08f)
                // v 11.84
                verticalLineToRelative(dy = 11.84f)
                // L 19.6 20z
                lineTo(x = 19.6f, y = 20.0f)
                close()
                // m -8 8
                moveToRelative(dx = -8.0f, dy = 8.0f)
                // L 25.15 27
                lineTo(x = 25.15f, y = 27.0f)
                // H 19z
                horizontalLineTo(x = 19.0f)
                close()
                // M 13 3
                moveTo(x = 13.0f, y = 3.0f)
                // H 5
                horizontalLineTo(x = 5.0f)
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
                // v 22
                verticalLineToRelative(dy = 22.0f)
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
                // V 5
                verticalLineTo(y = 5.0f)
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
                // m 0 6.92
                moveToRelative(dx = 0.0f, dy = 6.92f)
                // L 6.85 5
                lineTo(x = 6.85f, y = 5.0f)
                // H 13z
                horizontalLineTo(x = 13.0f)
                close()
                // M 12.4 12
                moveTo(x = 12.4f, y = 12.0f)
                // L 5 17.92
                lineTo(x = 5.0f, y = 17.92f)
                // V 6.08z
                verticalLineTo(y = 6.08f)
                close()
                // m 0.6 2.08
                moveToRelative(dx = 0.6f, dy = 2.08f)
                // v 11.84
                verticalLineToRelative(dy = 11.84f)
                // L 5.6 20z
                lineTo(x = 5.6f, y = 20.0f)
                close()
                // m -8 8
                moveToRelative(dx = -8.0f, dy = 8.0f)
                // L 11.15 27
                lineTo(x = 11.15f, y = 27.0f)
                // H 5z
                horizontalLineTo(x = 5.0f)
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
        }.build().also { _zSystems = it }
    }

@Suppress("ObjectPropertyName")
private var _zSystems: ImageVector? = null
