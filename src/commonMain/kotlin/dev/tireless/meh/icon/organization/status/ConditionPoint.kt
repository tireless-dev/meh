package dev.tireless.meh.icon.organization.status

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ConditionPoint: ImageVector
    get() {
        val current = _conditionPoint
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.ConditionPoint",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <rect width="11" height="11" x="10.343" y="10.343" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 7.999795 16
                moveTo(x = 7.999795f, y = 16.0f)
                // l 7.7781744 -7.7781744
                lineToRelative(dx = 7.7781744f, dy = -7.7781744f)
                // l 7.7781744 7.7781744
                lineToRelative(dx = 7.7781744f, dy = 7.7781744f)
                // l -7.7781744 7.7781744z
                lineToRelative(dx = -7.7781744f, dy = 7.7781744f)
                close()
            }
            // M29.4 14.53 17.46 2.6 a2.1 2.1 0 0 0 -2.94 0 L2.6 14.53 a2.1 2.1 0 0 0 0 2.94 L14.53 29.4 a2.1 2.1 0 0 0 2.94 0 L29.4 17.47 a2.1 2.1 0 0 0 0 -2.94 M16 28.03 3.96 16 16 3.96 28.04 16Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 29.4 14.53
                moveTo(x = 29.4f, y = 14.53f)
                // L 17.46 2.6
                lineTo(x = 17.46f, y = 2.6f)
                // a 2.1 2.1 0 0 0 -2.94 0
                arcToRelative(
                    a = 2.1f,
                    b = 2.1f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.94f,
                    dy1 = 0.0f,
                )
                // L 2.6 14.53
                lineTo(x = 2.6f, y = 14.53f)
                // a 2.1 2.1 0 0 0 0 2.94
                arcToRelative(
                    a = 2.1f,
                    b = 2.1f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 2.94f,
                )
                // L 14.53 29.4
                lineTo(x = 14.53f, y = 29.4f)
                // a 2.1 2.1 0 0 0 2.94 0
                arcToRelative(
                    a = 2.1f,
                    b = 2.1f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.94f,
                    dy1 = 0.0f,
                )
                // L 29.4 17.47
                lineTo(x = 29.4f, y = 17.47f)
                // a 2.1 2.1 0 0 0 0 -2.94
                arcToRelative(
                    a = 2.1f,
                    b = 2.1f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = -2.94f,
                )
                // M 16 28.03
                moveTo(x = 16.0f, y = 28.03f)
                // L 3.96 16
                lineTo(x = 3.96f, y = 16.0f)
                // L 16 3.96
                lineTo(x = 16.0f, y = 3.96f)
                // L 28.04 16z
                lineTo(x = 28.04f, y = 16.0f)
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
        }.build().also { _conditionPoint = it }
    }

@Suppress("ObjectPropertyName")
private var _conditionPoint: ImageVector? = null
