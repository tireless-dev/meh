package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val WorshipChristian: ImageVector
    get() {
        val current = _worshipChristian
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.WorshipChristian",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M17 30 h-2 a2 2 0 0 1 -2 -2 V14 H8 a2 2 0 0 1 -2 -2 v-2 a2 2 0 0 1 2 -2 h5 V4 a2 2 0 0 1 2 -2 h2 a2 2 0 0 1 2 2 v4 h5 a2 2 0 0 1 2 2 v2 a2 2 0 0 1 -2 2 h-5 v14 a2 2 0 0 1 -2 2 M8 10 v2 h7 v16 h2 V12 h7 v-2 h-7 V4 h-2 v6Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 17 30
                moveTo(x = 17.0f, y = 30.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
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
                // V 14
                verticalLineTo(y = 14.0f)
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
                // v -2
                verticalLineToRelative(dy = -2.0f)
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
                // h 5
                horizontalLineToRelative(dx = 5.0f)
                // V 4
                verticalLineTo(y = 4.0f)
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
                // h 2
                horizontalLineToRelative(dx = 2.0f)
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
                // h 5
                horizontalLineToRelative(dx = 5.0f)
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
                // v 2
                verticalLineToRelative(dy = 2.0f)
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
                // h -5
                horizontalLineToRelative(dx = -5.0f)
                // v 14
                verticalLineToRelative(dy = 14.0f)
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
                // M 8 10
                moveTo(x = 8.0f, y = 10.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 7
                horizontalLineToRelative(dx = 7.0f)
                // v 16
                verticalLineToRelative(dy = 16.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // V 12
                verticalLineTo(y = 12.0f)
                // h 7
                horizontalLineToRelative(dx = 7.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h -7
                horizontalLineToRelative(dx = -7.0f)
                // V 4
                verticalLineTo(y = 4.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v 6z
                verticalLineToRelative(dy = 6.0f)
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
        }.build().also { _worshipChristian = it }
    }

@Suppress("ObjectPropertyName")
private var _worshipChristian: ImageVector? = null
