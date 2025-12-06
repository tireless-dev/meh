package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Catalog: ImageVector
    get() {
        val current = _catalog
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Catalog",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M26 2 H8 a2 2 0 0 0 -2 2 v4 H4 v2 h2 v5 H4 v2 h2 v5 H4 v2 h2 v4 a2 2 0 0 0 2 2 h18 a2 2 0 0 0 2 -2 V4 a2 2 0 0 0 -2 -2 m0 26 H8 v-4 h2 v-2 H8 v-5 h2 v-2 H8 v-5 h2 V8 H8 V4 h18Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 26 2
                moveTo(x = 26.0f, y = 2.0f)
                // H 8
                horizontalLineTo(x = 8.0f)
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
                // H 4
                horizontalLineTo(x = 4.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 5
                verticalLineToRelative(dy = 5.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 5
                verticalLineToRelative(dy = 5.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
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
                // h 18
                horizontalLineToRelative(dx = 18.0f)
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
                // m 0 26
                moveToRelative(dx = 0.0f, dy = 26.0f)
                // H 8
                horizontalLineTo(x = 8.0f)
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // H 8
                horizontalLineTo(x = 8.0f)
                // v -5
                verticalLineToRelative(dy = -5.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // H 8
                horizontalLineTo(x = 8.0f)
                // v -5
                verticalLineToRelative(dy = -5.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // V 8
                verticalLineTo(y = 8.0f)
                // H 8
                horizontalLineTo(x = 8.0f)
                // V 4
                verticalLineTo(y = 4.0f)
                // h 18z
                horizontalLineToRelative(dx = 18.0f)
                close()
            }
            // <rect width="8" height="2" x="14.0" y="8.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 14 8
                moveTo(x = 14.0f, y = 8.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -8z
                horizontalLineToRelative(dx = -8.0f)
                close()
            }
            // <rect width="8" height="2" x="14.0" y="15.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 14 15
                moveTo(x = 14.0f, y = 15.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -8z
                horizontalLineToRelative(dx = -8.0f)
                close()
            }
            // <rect width="8" height="2" x="14.0" y="22.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 14 22
                moveTo(x = 14.0f, y = 22.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -8z
                horizontalLineToRelative(dx = -8.0f)
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
        }.build().also { _catalog = it }
    }

@Suppress("ObjectPropertyName")
private var _catalog: ImageVector? = null
