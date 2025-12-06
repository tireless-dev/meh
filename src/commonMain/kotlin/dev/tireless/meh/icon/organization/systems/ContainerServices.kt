package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ContainerServices: ImageVector
    get() {
        val current = _containerServices
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.ContainerServices",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M27 22 v-5 a2 2 0 0 0 -2 -2 h-8 v-5 h3 a2 2 0 0 0 2 -2 V4 a2 2 0 0 0 -2 -2 h-8 a2 2 0 0 0 -2 2 v4 a2 2 0 0 0 2 2 h3 v5 H7 a2 2 0 0 0 -2 2 v5 H2 v8 h8 v-8 H7 v-5 h8 v5 h-3 v8 h8 v-8 h-3 v-5 h8 v5 h-3 v8 h8 v-8Z M12 4 h8 v4 h-8Z M8 28 H4 v-4 h4Z m10 0 h-4 v-4 h4Z m10 0 h-4 v-4 h4Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 27 22
                moveTo(x = 27.0f, y = 22.0f)
                // v -5
                verticalLineToRelative(dy = -5.0f)
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
                // h -8
                horizontalLineToRelative(dx = -8.0f)
                // v -5
                verticalLineToRelative(dy = -5.0f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
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
                // h -8
                horizontalLineToRelative(dx = -8.0f)
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
                // v 4
                verticalLineToRelative(dy = 4.0f)
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
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // v 5
                verticalLineToRelative(dy = 5.0f)
                // H 7
                horizontalLineTo(x = 7.0f)
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
                // v 5
                verticalLineToRelative(dy = 5.0f)
                // H 2
                horizontalLineTo(x = 2.0f)
                // v 8
                verticalLineToRelative(dy = 8.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // v -8
                verticalLineToRelative(dy = -8.0f)
                // H 7
                horizontalLineTo(x = 7.0f)
                // v -5
                verticalLineToRelative(dy = -5.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // v 5
                verticalLineToRelative(dy = 5.0f)
                // h -3
                horizontalLineToRelative(dx = -3.0f)
                // v 8
                verticalLineToRelative(dy = 8.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // v -8
                verticalLineToRelative(dy = -8.0f)
                // h -3
                horizontalLineToRelative(dx = -3.0f)
                // v -5
                verticalLineToRelative(dy = -5.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // v 5
                verticalLineToRelative(dy = 5.0f)
                // h -3
                horizontalLineToRelative(dx = -3.0f)
                // v 8
                verticalLineToRelative(dy = 8.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // v -8z
                verticalLineToRelative(dy = -8.0f)
                close()
                // M 12 4
                moveTo(x = 12.0f, y = 4.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h -8z
                horizontalLineToRelative(dx = -8.0f)
                close()
                // M 8 28
                moveTo(x = 8.0f, y = 28.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // h 4z
                horizontalLineToRelative(dx = 4.0f)
                close()
                // m 10 0
                moveToRelative(dx = 10.0f, dy = 0.0f)
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // h 4z
                horizontalLineToRelative(dx = 4.0f)
                close()
                // m 10 0
                moveToRelative(dx = 10.0f, dy = 0.0f)
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // v -4
                verticalLineToRelative(dy = -4.0f)
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
        }.build().also { _containerServices = it }
    }

@Suppress("ObjectPropertyName")
private var _containerServices: ImageVector? = null
