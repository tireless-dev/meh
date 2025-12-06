package dev.tireless.meh.icon.person.user

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Education: ImageVector
    get() {
        val current = _education
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Education",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M26 30 h-2 v-3 a5 5 0 0 0 -5 -5 h-6 a5 5 0 0 0 -5 5 v3 H6 v-3 a7 7 0 0 1 7 -7 h6 a7 7 0 0 1 7 7Z M5 6 a1 1 0 0 0 -1 1 v9 h2 V7 a1 1 0 0 0 -1 -1
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 26 30
                moveTo(x = 26.0f, y = 30.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v -3
                verticalLineToRelative(dy = -3.0f)
                // a 5 5 0 0 0 -5 -5
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -5.0f,
                    dy1 = -5.0f,
                )
                // h -6
                horizontalLineToRelative(dx = -6.0f)
                // a 5 5 0 0 0 -5 5
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -5.0f,
                    dy1 = 5.0f,
                )
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // H 6
                horizontalLineTo(x = 6.0f)
                // v -3
                verticalLineToRelative(dy = -3.0f)
                // a 7 7 0 0 1 7 -7
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 7.0f,
                    dy1 = -7.0f,
                )
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // a 7 7 0 0 1 7 7z
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 7.0f,
                    dy1 = 7.0f,
                )
                close()
                // M 5 6
                moveTo(x = 5.0f, y = 6.0f)
                // a 1 1 0 0 0 -1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.0f,
                    dy1 = 1.0f,
                )
                // v 9
                verticalLineToRelative(dy = 9.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // V 7
                verticalLineTo(y = 7.0f)
                // a 1 1 0 0 0 -1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.0f,
                    dy1 = -1.0f,
                )
            }
            // M4 2 v2 h5 v7 a7 7 0 0 0 14 0 V4 h5 V2Z m7 2 h10 v3 H11Z m5 12 a5 5 0 0 1 -5 -5 V9 h10 v2 a5 5 0 0 1 -5 5
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 4 2
                moveTo(x = 4.0f, y = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 5
                horizontalLineToRelative(dx = 5.0f)
                // v 7
                verticalLineToRelative(dy = 7.0f)
                // a 7 7 0 0 0 14 0
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 14.0f,
                    dy1 = 0.0f,
                )
                // V 4
                verticalLineTo(y = 4.0f)
                // h 5
                horizontalLineToRelative(dx = 5.0f)
                // V 2z
                verticalLineTo(y = 2.0f)
                close()
                // m 7 2
                moveToRelative(dx = 7.0f, dy = 2.0f)
                // h 10
                horizontalLineToRelative(dx = 10.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // H 11z
                horizontalLineTo(x = 11.0f)
                close()
                // m 5 12
                moveToRelative(dx = 5.0f, dy = 12.0f)
                // a 5 5 0 0 1 -5 -5
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -5.0f,
                    dy1 = -5.0f,
                )
                // V 9
                verticalLineTo(y = 9.0f)
                // h 10
                horizontalLineToRelative(dx = 10.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // a 5 5 0 0 1 -5 5
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -5.0f,
                    dy1 = 5.0f,
                )
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
        }.build().also { _education = it }
    }

@Suppress("ObjectPropertyName")
private var _education: ImageVector? = null
