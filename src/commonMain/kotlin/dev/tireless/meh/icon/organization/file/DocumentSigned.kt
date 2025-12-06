package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DocumentSigned: ImageVector
    get() {
        val current = _documentSigned
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.DocumentSigned",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M19.41 30 H15 v-4.41 l5.03 -5.04 L20 20 a5 5 0 1 1 4.45 4.97Z M17 28 h1.59 l5.2 -5.2 .54 .12 a3.04 3.04 0 1 0 -2.25 -2.25 l.13 .54 L17 26.4Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 19.41 30
                moveTo(x = 19.41f, y = 30.0f)
                // H 15
                horizontalLineTo(x = 15.0f)
                // v -4.41
                verticalLineToRelative(dy = -4.41f)
                // l 5.03 -5.04
                lineToRelative(dx = 5.03f, dy = -5.04f)
                // L 20 20
                lineTo(x = 20.0f, y = 20.0f)
                // a 5 5 0 1 1 4.45 4.97z
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 4.45f,
                    dy1 = 4.97f,
                )
                close()
                // M 17 28
                moveTo(x = 17.0f, y = 28.0f)
                // h 1.59
                horizontalLineToRelative(dx = 1.59f)
                // l 5.2 -5.2
                lineToRelative(dx = 5.2f, dy = -5.2f)
                // l 0.54 0.12
                lineToRelative(dx = 0.54f, dy = 0.12f)
                // a 3.04 3.04 0 1 0 -2.25 -2.25
                arcToRelative(
                    a = 3.04f,
                    b = 3.04f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -2.25f,
                    dy1 = -2.25f,
                )
                // l 0.13 0.54
                lineToRelative(dx = 0.13f, dy = 0.54f)
                // L 17 26.4z
                lineTo(x = 17.0f, y = 26.4f)
                close()
            }
            // <circle cx="25.0" cy="20.0" radius="1.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 25 20
                moveTo(x = 25.0f, y = 20.0f)
                // m -1 0
                moveToRelative(dx = -1.0f, dy = 0.0f)
                // a 1 1 0 1 1 2 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 0.0f,
                )
                // a 1 1 0 1 1 -2 0z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // <rect width="12" height="2" x="8.0" y="6.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 8 6
                moveTo(x = 8.0f, y = 6.0f)
                // h 12
                horizontalLineToRelative(dx = 12.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -12z
                horizontalLineToRelative(dx = -12.0f)
                close()
            }
            // <rect width="12" height="2" x="8.0" y="10.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 8 10
                moveTo(x = 8.0f, y = 10.0f)
                // h 12
                horizontalLineToRelative(dx = 12.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -12z
                horizontalLineToRelative(dx = -12.0f)
                close()
            }
            // <rect width="6" height="2" x="8.0" y="14.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 8 14
                moveTo(x = 8.0f, y = 14.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -6z
                horizontalLineToRelative(dx = -6.0f)
                close()
            }
            // <rect width="4" height="2" x="8.0" y="24.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 8 24
                moveTo(x = 8.0f, y = 24.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -4z
                horizontalLineToRelative(dx = -4.0f)
                close()
            }
            // M12 30 H6 a2 2 0 0 1 -2 -2 V4 a2 2 0 0 1 2 -2 h16 a2 2 0 0 1 2 2 v9 h-2 V4 H6 v24 h6Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 12 30
                moveTo(x = 12.0f, y = 30.0f)
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
                // h 16
                horizontalLineToRelative(dx = 16.0f)
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
                // v 9
                verticalLineToRelative(dy = 9.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // V 4
                verticalLineTo(y = 4.0f)
                // H 6
                horizontalLineTo(x = 6.0f)
                // v 24
                verticalLineToRelative(dy = 24.0f)
                // h 6z
                horizontalLineToRelative(dx = 6.0f)
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
        }.build().also { _documentSigned = it }
    }

@Suppress("ObjectPropertyName")
private var _documentSigned: ImageVector? = null
