package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DirectionStraightRightFilled: ImageVector
    get() {
        val current = _directionStraightRightFilled
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.DirectionStraightRightFilled",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M28 2 H4 a2 2 0 0 0 -2 2 v24 a2 2 0 0 0 2 2 h24 a2 2 0 0 0 2 -2 V4 a2 2 0 0 0 -2 -2 m-8 21 -1.41 -1.41 L23.17 17 H6 v-2 h17.17 l-4.58 -4.59 L20 9 l7 7Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 28 2
                moveTo(x = 28.0f, y = 2.0f)
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
                // v 24
                verticalLineToRelative(dy = 24.0f)
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
                // m -8 21
                moveToRelative(dx = -8.0f, dy = 21.0f)
                // l -1.41 -1.41
                lineToRelative(dx = -1.41f, dy = -1.41f)
                // L 23.17 17
                lineTo(x = 23.17f, y = 17.0f)
                // H 6
                horizontalLineTo(x = 6.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h 17.17
                horizontalLineToRelative(dx = 17.17f)
                // l -4.58 -4.59
                lineToRelative(dx = -4.58f, dy = -4.59f)
                // L 20 9
                lineTo(x = 20.0f, y = 9.0f)
                // l 7 7z
                lineToRelative(dx = 7.0f, dy = 7.0f)
                close()
            }
            // m20 23 -1.41 -1.41 L23.17 17 H6 v-2 h17.17 l-4.58 -4.59 L20 9 l7 7Z
            path {
                // M 20 23
                moveTo(x = 20.0f, y = 23.0f)
                // l -1.41 -1.41
                lineToRelative(dx = -1.41f, dy = -1.41f)
                // L 23.17 17
                lineTo(x = 23.17f, y = 17.0f)
                // H 6
                horizontalLineTo(x = 6.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h 17.17
                horizontalLineToRelative(dx = 17.17f)
                // l -4.58 -4.59
                lineToRelative(dx = -4.58f, dy = -4.59f)
                // L 20 9
                lineTo(x = 20.0f, y = 9.0f)
                // l 7 7z
                lineToRelative(dx = 7.0f, dy = 7.0f)
                close()
            }
            // <rect width="32" height="32" fill="#000" />
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
        }.build().also { _directionStraightRightFilled = it }
    }

@Suppress("ObjectPropertyName")
private var _directionStraightRightFilled: ImageVector? = null
