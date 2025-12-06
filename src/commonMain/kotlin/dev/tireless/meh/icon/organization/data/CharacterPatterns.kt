package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CharacterPatterns: ImageVector
    get() {
        val current = _characterPatterns
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.CharacterPatterns",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M6 26 v-8.17 L2.41 21.4 1 20 l6 -6 6 6 -1.41 1.41 L8 17.83 V26 h10 v2 H8 a2 2 0 0 1 -2 -2
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 6 26
                moveTo(x = 6.0f, y = 26.0f)
                // v -8.17
                verticalLineToRelative(dy = -8.17f)
                // L 2.41 21.4
                lineTo(x = 2.41f, y = 21.4f)
                // L 1 20
                lineTo(x = 1.0f, y = 20.0f)
                // l 6 -6
                lineToRelative(dx = 6.0f, dy = -6.0f)
                // l 6 6
                lineToRelative(dx = 6.0f, dy = 6.0f)
                // l -1.41 1.41
                lineToRelative(dx = -1.41f, dy = 1.41f)
                // L 8 17.83
                lineTo(x = 8.0f, y = 17.83f)
                // V 26
                verticalLineTo(y = 26.0f)
                // h 10
                horizontalLineToRelative(dx = 10.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // H 8
                horizontalLineTo(x = 8.0f)
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
            }
            // <polygon points="30.0 22.0 30.0 20.0 22.0 20.0 22.0 22.0 27.5 22.0 22.0 28.0 22.0 30.0 30.0 30.0 30.0 28.0 24.507 28.0 30.0 22.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 30 22
                moveTo(x = 30.0f, y = 22.0f)
                // L 30 20
                lineTo(x = 30.0f, y = 20.0f)
                // L 22 20
                lineTo(x = 22.0f, y = 20.0f)
                // L 22 22
                lineTo(x = 22.0f, y = 22.0f)
                // L 27.5 22
                lineTo(x = 27.5f, y = 22.0f)
                // L 22 28
                lineTo(x = 22.0f, y = 28.0f)
                // L 22 30
                lineTo(x = 22.0f, y = 30.0f)
                // L 30 30
                lineTo(x = 30.0f, y = 30.0f)
                // L 30 28
                lineTo(x = 30.0f, y = 28.0f)
                // L 24.507 28
                lineTo(x = 24.507f, y = 28.0f)
                // L 30 22z
                lineTo(x = 30.0f, y = 22.0f)
                close()
            }
            // M26 6 v8.17 l3.59 -3.58 L31 12 l-6 6 -6 -6 1.41 -1.41 L24 14.17 V6 H14 V4 h10 a2 2 0 0 1 2 2 M8 2 H3 v2 h5 v2 H4 a2 2 0 0 0 -2 2 v2 a2 2 0 0 0 2 2 h6 V4 a2 2 0 0 0 -2 -2 m0 8 H4 V8 h4Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 26 6
                moveTo(x = 26.0f, y = 6.0f)
                // v 8.17
                verticalLineToRelative(dy = 8.17f)
                // l 3.59 -3.58
                lineToRelative(dx = 3.59f, dy = -3.58f)
                // L 31 12
                lineTo(x = 31.0f, y = 12.0f)
                // l -6 6
                lineToRelative(dx = -6.0f, dy = 6.0f)
                // l -6 -6
                lineToRelative(dx = -6.0f, dy = -6.0f)
                // l 1.41 -1.41
                lineToRelative(dx = 1.41f, dy = -1.41f)
                // L 24 14.17
                lineTo(x = 24.0f, y = 14.17f)
                // V 6
                verticalLineTo(y = 6.0f)
                // H 14
                horizontalLineTo(x = 14.0f)
                // V 4
                verticalLineTo(y = 4.0f)
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
                // M 8 2
                moveTo(x = 8.0f, y = 2.0f)
                // H 3
                horizontalLineTo(x = 3.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 5
                horizontalLineToRelative(dx = 5.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
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
                // v 2
                verticalLineToRelative(dy = 2.0f)
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
                // m 0 8
                moveToRelative(dx = 0.0f, dy = 8.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // V 8
                verticalLineTo(y = 8.0f)
                // h 4z
                horizontalLineToRelative(dx = 4.0f)
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
        }.build().also { _characterPatterns = it }
    }

@Suppress("ObjectPropertyName")
private var _characterPatterns: ImageVector? = null
