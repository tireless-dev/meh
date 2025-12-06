package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ConnectionFlowUsage: ImageVector
    get() {
        val current = _connectionFlowUsage
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.ConnectionFlowUsage",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // m22 16 -1.41 1.41 L25.17 22 H15 V5 a2 2 0 0 0 -2 -2 H3 v2 h10 v17 a2 2 0 0 0 2 2 h10.17 l-4.58 4.59 L22 30 l7 -7z
            path(
                strokeLineWidth = 0.0f,
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 22 16
                moveTo(x = 22.0f, y = 16.0f)
                // l -1.41 1.41
                lineToRelative(dx = -1.41f, dy = 1.41f)
                // L 25.17 22
                lineTo(x = 25.17f, y = 22.0f)
                // H 15
                horizontalLineTo(x = 15.0f)
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
                // H 3
                horizontalLineTo(x = 3.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 10
                horizontalLineToRelative(dx = 10.0f)
                // v 17
                verticalLineToRelative(dy = 17.0f)
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
                // h 10.17
                horizontalLineToRelative(dx = 10.17f)
                // l -4.58 4.59
                lineToRelative(dx = -4.58f, dy = 4.59f)
                // L 22 30
                lineTo(x = 22.0f, y = 30.0f)
                // l 7 -7z
                lineToRelative(dx = 7.0f, dy = -7.0f)
                close()
            }
            // <rect width="32" height="32" fill="#000" style="fill:none;stroke-width:0" stroke-width="0" />
            path(
                fill = SolidColor(Color.Transparent),
                strokeLineWidth = 0.0f,
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
        }.build().also { _connectionFlowUsage = it }
    }

@Suppress("ObjectPropertyName")
private var _connectionFlowUsage: ImageVector? = null
