package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ContainerImagePush: ImageVector
    get() {
        val current = _containerImagePush
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.ContainerImagePush",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M30 23 H20 a2 2 0 0 1 -2 -2 V11 a2 2 0 0 1 2 -2 h10 a2 2 0 0 1 2 2 v10 a2 2 0 0 1 -2 2 M20 11 v10 h10 V11z
            path(
                strokeLineWidth = 0.0f,
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 30 23
                moveTo(x = 30.0f, y = 23.0f)
                // H 20
                horizontalLineTo(x = 20.0f)
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
                // h 10
                horizontalLineToRelative(dx = 10.0f)
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
                // M 20 11
                moveTo(x = 20.0f, y = 11.0f)
                // v 10
                verticalLineToRelative(dy = 10.0f)
                // h 10
                horizontalLineToRelative(dx = 10.0f)
                // V 11z
                verticalLineTo(y = 11.0f)
                close()
            }
            // <polygon points="9.0 11.0 14.0 16.0 9.0 21.0 7.581 19.591 10.153 17.0 0.0 17.0 0.0 15.0 10.206 15.0 7.581 12.409 9.0 11.0" fill="#000" stroke-width="0" />
            path(
                fill = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 0.0f,
            ) {
                // M 9 11
                moveTo(x = 9.0f, y = 11.0f)
                // L 14 16
                lineTo(x = 14.0f, y = 16.0f)
                // L 9 21
                lineTo(x = 9.0f, y = 21.0f)
                // L 7.581 19.591
                lineTo(x = 7.581f, y = 19.591f)
                // L 10.153 17
                lineTo(x = 10.153f, y = 17.0f)
                // L 0 17
                lineTo(x = 0.0f, y = 17.0f)
                // L 0 15
                lineTo(x = 0.0f, y = 15.0f)
                // L 10.206 15
                lineTo(x = 10.206f, y = 15.0f)
                // L 7.581 12.409
                lineTo(x = 7.581f, y = 12.409f)
                // L 9 11z
                lineTo(x = 9.0f, y = 11.0f)
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
        }.build().also { _containerImagePush = it }
    }

@Suppress("ObjectPropertyName")
private var _containerImagePush: ImageVector? = null
