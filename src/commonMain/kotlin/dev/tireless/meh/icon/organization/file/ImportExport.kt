package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ImportExport: ImageVector
    get() {
        val current = _importExport
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.ImportExport",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M28 24 v4 H4 v-4 H2 v4 a2 2 0 0 0 2 2 h24 a2 2 0 0 0 2 -2 v-4Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 28 24
                moveTo(x = 28.0f, y = 24.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // H 2
                horizontalLineTo(x = 2.0f)
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
                // v -4z
                verticalLineToRelative(dy = -4.0f)
                close()
            }
            // <polygon points="27.6 14.6 24.0 18.2 24.0 4.0 22.0 4.0 22.0 18.2 18.4 14.6 17.0 16.0 23.0 22.0 29.0 16.0 27.6 14.6" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 27.6 14.6
                moveTo(x = 27.6f, y = 14.6f)
                // L 24 18.2
                lineTo(x = 24.0f, y = 18.2f)
                // L 24 4
                lineTo(x = 24.0f, y = 4.0f)
                // L 22 4
                lineTo(x = 22.0f, y = 4.0f)
                // L 22 18.2
                lineTo(x = 22.0f, y = 18.2f)
                // L 18.4 14.6
                lineTo(x = 18.4f, y = 14.6f)
                // L 17 16
                lineTo(x = 17.0f, y = 16.0f)
                // L 23 22
                lineTo(x = 23.0f, y = 22.0f)
                // L 29 16
                lineTo(x = 29.0f, y = 16.0f)
                // L 27.6 14.6z
                lineTo(x = 27.6f, y = 14.6f)
                close()
            }
            // <polygon points="9.0 4.0 3.0 10.0 4.4 11.4 8.0 7.8 8.0 22.0 10.0 22.0 10.0 7.8 13.6 11.4 15.0 10.0 9.0 4.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 9 4
                moveTo(x = 9.0f, y = 4.0f)
                // L 3 10
                lineTo(x = 3.0f, y = 10.0f)
                // L 4.4 11.4
                lineTo(x = 4.4f, y = 11.4f)
                // L 8 7.8
                lineTo(x = 8.0f, y = 7.8f)
                // L 8 22
                lineTo(x = 8.0f, y = 22.0f)
                // L 10 22
                lineTo(x = 10.0f, y = 22.0f)
                // L 10 7.8
                lineTo(x = 10.0f, y = 7.8f)
                // L 13.6 11.4
                lineTo(x = 13.6f, y = 11.4f)
                // L 15 10
                lineTo(x = 15.0f, y = 10.0f)
                // L 9 4z
                lineTo(x = 9.0f, y = 4.0f)
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
        }.build().also { _importExport = it }
    }

@Suppress("ObjectPropertyName")
private var _importExport: ImageVector? = null
