package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FlowModelerReference: ImageVector
    get() {
        val current = _flowModelerReference
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.FlowModelerReference",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M30 30 h-8 v-8 h8Z m-6 -2 h4 v-4 h-4Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 30 30
                moveTo(x = 30.0f, y = 30.0f)
                // h -8
                horizontalLineToRelative(dx = -8.0f)
                // v -8
                verticalLineToRelative(dy = -8.0f)
                // h 8z
                horizontalLineToRelative(dx = 8.0f)
                close()
                // m -6 -2
                moveToRelative(dx = -6.0f, dy = -2.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // h -4z
                horizontalLineToRelative(dx = -4.0f)
                close()
            }
            // <polygon points="4.0 20.0 4.0 22.0 8.586 22.0 2.0 28.586 3.414 30.0 10.0 23.414 10.0 28.0 12.0 28.0 12.0 20.0 4.0 20.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 4 20
                moveTo(x = 4.0f, y = 20.0f)
                // L 4 22
                lineTo(x = 4.0f, y = 22.0f)
                // L 8.586 22
                lineTo(x = 8.586f, y = 22.0f)
                // L 2 28.586
                lineTo(x = 2.0f, y = 28.586f)
                // L 3.414 30
                lineTo(x = 3.414f, y = 30.0f)
                // L 10 23.414
                lineTo(x = 10.0f, y = 23.414f)
                // L 10 28
                lineTo(x = 10.0f, y = 28.0f)
                // L 12 28
                lineTo(x = 12.0f, y = 28.0f)
                // L 12 20
                lineTo(x = 12.0f, y = 20.0f)
                // L 4 20z
                lineTo(x = 4.0f, y = 20.0f)
                close()
            }
            // M19 11 h-6 l-3 4 6 6 6 -6Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 19 11
                moveTo(x = 19.0f, y = 11.0f)
                // h -6
                horizontalLineToRelative(dx = -6.0f)
                // l -3 4
                lineToRelative(dx = -3.0f, dy = 4.0f)
                // l 6 6
                lineToRelative(dx = 6.0f, dy = 6.0f)
                // l 6 -6z
                lineToRelative(dx = 6.0f, dy = -6.0f)
                close()
            }
            // M24 17 v-2 a4 4 0 0 0 0 -8 H12 V5 h12 a6 6 0 0 1 0 12 m-14 -7 H2 V2 h8Z M4 8 h4 V4 H4Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 24 17
                moveTo(x = 24.0f, y = 17.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // a 4 4 0 0 0 0 -8
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = -8.0f,
                )
                // H 12
                horizontalLineTo(x = 12.0f)
                // V 5
                verticalLineTo(y = 5.0f)
                // h 12
                horizontalLineToRelative(dx = 12.0f)
                // a 6 6 0 0 1 0 12
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 12.0f,
                )
                // m -14 -7
                moveToRelative(dx = -14.0f, dy = -7.0f)
                // H 2
                horizontalLineTo(x = 2.0f)
                // V 2
                verticalLineTo(y = 2.0f)
                // h 8z
                horizontalLineToRelative(dx = 8.0f)
                close()
                // M 4 8
                moveTo(x = 4.0f, y = 8.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // V 4
                verticalLineTo(y = 4.0f)
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
        }.build().also { _flowModelerReference = it }
    }

@Suppress("ObjectPropertyName")
private var _flowModelerReference: ImageVector? = null
