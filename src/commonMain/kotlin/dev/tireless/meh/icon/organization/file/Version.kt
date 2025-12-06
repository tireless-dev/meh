package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Version: ImageVector
    get() {
        val current = _version
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Version",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M16 2 v2 h10 v15 h2 V4 a2 2 0 0 0 -2 -2Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 16 2
                moveTo(x = 16.0f, y = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 10
                horizontalLineToRelative(dx = 10.0f)
                // v 15
                verticalLineToRelative(dy = 15.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // V 4
                verticalLineTo(y = 4.0f)
                // a 2 2 0 0 0 -2 -2z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
                close()
            }
            // M11 7 v2 h10 v15 h2 V9 a2 2 0 0 0 -2 -2Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 11 7
                moveTo(x = 11.0f, y = 7.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 10
                horizontalLineToRelative(dx = 10.0f)
                // v 15
                verticalLineToRelative(dy = 15.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // V 9
                verticalLineTo(y = 9.0f)
                // a 2 2 0 0 0 -2 -2z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
                close()
            }
            // M6 12 h10 a2 2 0 0 1 2 2 v14 a2 2 0 0 1 -2 2 H6 a2 2 0 0 1 -2 -2 V14 a2 2 0 0 1 2 -2 m10 2 H6 v14 h10Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 6 12
                moveTo(x = 6.0f, y = 12.0f)
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
                // V 14
                verticalLineTo(y = 14.0f)
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
                // m 10 2
                moveToRelative(dx = 10.0f, dy = 2.0f)
                // H 6
                horizontalLineTo(x = 6.0f)
                // v 14
                verticalLineToRelative(dy = 14.0f)
                // h 10z
                horizontalLineToRelative(dx = 10.0f)
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
        }.build().also { _version = it }
    }

@Suppress("ObjectPropertyName")
private var _version: ImageVector? = null
