package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DiamondSolid: ImageVector
    get() {
        val current = _diamondSolid
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.DiamondSolid",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M29.4 14.53 17.46 2.6 a2.1 2.1 0 0 0 -2.94 0 L2.6 14.53 a2.1 2.1 0 0 0 0 2.94 L14.53 29.4 a2.1 2.1 0 0 0 2.94 0 L29.4 17.47 a2.1 2.1 0 0 0 0 -2.94
            path(
                strokeLineWidth = 0.0f,
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
            }
            // <rect width="32" height="32" fill="#000" style="fill:none;stroke-width:0" stroke-width="0" />
            path(
                fill = SolidColor(Color.Transparent),
                strokeLineWidth = 0.0f,
            ) {
                // M 0 32
                moveTo(x = 0.0f, y = 32.0f)
                // l -1.3987644E-6 -32
                lineToRelative(dx = -1.3987644E-6f, dy = -32.0f)
                // l 32 -1.3987644E-6
                lineToRelative(dx = 32.0f, dy = -1.3987644E-6f)
                // l 1.3987644E-6 32z
                lineToRelative(dx = 1.3987644E-6f, dy = 32.0f)
                close()
            }
        }.build().also { _diamondSolid = it }
    }

@Suppress("ObjectPropertyName")
private var _diamondSolid: ImageVector? = null
