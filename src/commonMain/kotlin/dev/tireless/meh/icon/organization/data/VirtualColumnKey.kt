package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val VirtualColumnKey: ImageVector
    get() {
        val current = _virtualColumnKey
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.VirtualColumnKey",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <circle cx="24.5" cy="9.5" radius="1.5" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 24.5 9.5
                moveTo(x = 24.5f, y = 9.5f)
                // m -1.5 0
                moveToRelative(dx = -1.5f, dy = 0.0f)
                // a 1.5 1.5 0 1 1 3 0
                arcToRelative(
                    a = 1.5f,
                    b = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 3.0f,
                    dy1 = 0.0f,
                )
                // a 1.5 1.5 0 1 1 -3 0z
                arcToRelative(
                    a = 1.5f,
                    b = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -3.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M17.41 22 H12 v-5.41 l6.03 -6.03 L18 10 a6 6 0 1 1 6 6 l-.56 -.03Z M14 20 h2.59 l6.17 -6.17 .51 .1 A4 4 0 0 0 24 14 a4.05 4.05 0 1 0 -3.92 -3.27 l.09 .51 L14 17.41Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 17.41 22
                moveTo(x = 17.41f, y = 22.0f)
                // H 12
                horizontalLineTo(x = 12.0f)
                // v -5.41
                verticalLineToRelative(dy = -5.41f)
                // l 6.03 -6.03
                lineToRelative(dx = 6.03f, dy = -6.03f)
                // L 18 10
                lineTo(x = 18.0f, y = 10.0f)
                // a 6 6 0 1 1 6 6
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 6.0f,
                    dy1 = 6.0f,
                )
                // l -0.56 -0.03z
                lineToRelative(dx = -0.56f, dy = -0.03f)
                close()
                // M 14 20
                moveTo(x = 14.0f, y = 20.0f)
                // h 2.59
                horizontalLineToRelative(dx = 2.59f)
                // l 6.17 -6.17
                lineToRelative(dx = 6.17f, dy = -6.17f)
                // l 0.51 0.1
                lineToRelative(dx = 0.51f, dy = 0.1f)
                // A 4 4 0 0 0 24 14
                arcTo(
                    horizontalEllipseRadius = 4.0f,
                    verticalEllipseRadius = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 24.0f,
                    y1 = 14.0f,
                )
                // a 4.05 4.05 0 1 0 -3.92 -3.27
                arcToRelative(
                    a = 4.05f,
                    b = 4.05f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -3.92f,
                    dy1 = -3.27f,
                )
                // l 0.09 0.51
                lineToRelative(dx = 0.09f, dy = 0.51f)
                // L 14 17.41z
                lineTo(x = 14.0f, y = 17.41f)
                close()
            }
            // M28 18 v8 H10 V6 h4 V4 H4 a2 2 0 0 0 -2 2 v20 a2 2 0 0 0 2 2 h24 a2 2 0 0 0 2 -2 v-8Z M4 6 h4 v20 H4Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 28 18
                moveTo(x = 28.0f, y = 18.0f)
                // v 8
                verticalLineToRelative(dy = 8.0f)
                // H 10
                horizontalLineTo(x = 10.0f)
                // V 6
                verticalLineTo(y = 6.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // V 4
                verticalLineTo(y = 4.0f)
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
                // v 20
                verticalLineToRelative(dy = 20.0f)
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
                // v -8z
                verticalLineToRelative(dy = -8.0f)
                close()
                // M 4 6
                moveTo(x = 4.0f, y = 6.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 20
                verticalLineToRelative(dy = 20.0f)
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
        }.build().also { _virtualColumnKey = it }
    }

@Suppress("ObjectPropertyName")
private var _virtualColumnKey: ImageVector? = null
