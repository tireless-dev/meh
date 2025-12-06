package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Folders: ImageVector
    get() {
        val current = _folders
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Folders",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M26 28 H6 a2 2 0 0 1 -2 -2 V11 a2 2 0 0 1 2 -2 h5.67 a2 2 0 0 1 1.2 .4 l3.46 2.6 H26 a2 2 0 0 1 2 2 v12 a2 2 0 0 1 -2 2 M11.67 11 H6 v15 h20 V14 H15.67Z M28 9 H17.67 l-4 -3 H6 V4 h7.67 a2 2 0 0 1 1.2 .4 L18.33 7 H28Z
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
                // h 5.67
                horizontalLineToRelative(dx = 5.67f)
                // a 2 2 0 0 1 1.2 0.4
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.2f,
                    dy1 = 0.4f,
                )
                // l 3.46 2.6
                lineToRelative(dx = 3.46f, dy = 2.6f)
                // H 26
                horizontalLineTo(x = 26.0f)
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
                // v 12
                verticalLineToRelative(dy = 12.0f)
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
                // M 11.67 11
                moveTo(x = 11.67f, y = 11.0f)
                // H 6
                horizontalLineTo(x = 6.0f)
                // v 15
                verticalLineToRelative(dy = 15.0f)
                // h 20
                horizontalLineToRelative(dx = 20.0f)
                // V 14
                verticalLineTo(y = 14.0f)
                // H 15.67z
                horizontalLineTo(x = 15.67f)
                close()
                // M 28 9
                moveTo(x = 28.0f, y = 9.0f)
                // H 17.67
                horizontalLineTo(x = 17.67f)
                // l -4 -3
                lineToRelative(dx = -4.0f, dy = -3.0f)
                // H 6
                horizontalLineTo(x = 6.0f)
                // V 4
                verticalLineTo(y = 4.0f)
                // h 7.67
                horizontalLineToRelative(dx = 7.67f)
                // a 2 2 0 0 1 1.2 0.4
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.2f,
                    dy1 = 0.4f,
                )
                // L 18.33 7
                lineTo(x = 18.33f, y = 7.0f)
                // H 28z
                horizontalLineTo(x = 28.0f)
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
        }.build().also { _folders = it }
    }

@Suppress("ObjectPropertyName")
private var _folders: ImageVector? = null
