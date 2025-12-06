package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val BoxSmall: ImageVector
    get() {
        val current = _boxSmall
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.BoxSmall",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M26 28 H6 a2 2 0 0 1 -2 -2 V9 h2 v17 h20 V9 h2 v17 a2 2 0 0 1 -2 2
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 26 28
                moveTo(x = 26.0f, y = 28.0f)
                // H 6
                horizontalLineTo(x = 6.0f)
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
                // V 9
                verticalLineTo(y = 9.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 17
                verticalLineToRelative(dy = 17.0f)
                // h 20
                horizontalLineToRelative(dx = 20.0f)
                // V 9
                verticalLineTo(y = 9.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 17
                verticalLineToRelative(dy = 17.0f)
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
            }
            // M18 23 h-6 v-2 h6 v-4 h-4 a2 2 0 0 1 -2 -2 v-4 a2 2 0 0 1 2 -2 h6 v2 h-6 v4 h4 a2 2 0 0 1 2 2 v4 a2 2 0 0 1 -2 2
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 18 23
                moveTo(x = 18.0f, y = 23.0f)
                // h -6
                horizontalLineToRelative(dx = -6.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // h -4
                horizontalLineToRelative(dx = -4.0f)
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
                // v -4
                verticalLineToRelative(dy = -4.0f)
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
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -6
                horizontalLineToRelative(dx = -6.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
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
            }
            // <rect width="24" height="2" x="4.0" y="4.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 4 4
                moveTo(x = 4.0f, y = 4.0f)
                // h 24
                horizontalLineToRelative(dx = 24.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -24z
                horizontalLineToRelative(dx = -24.0f)
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
        }.build().also { _boxSmall = it }
    }

@Suppress("ObjectPropertyName")
private var _boxSmall: ImageVector? = null
