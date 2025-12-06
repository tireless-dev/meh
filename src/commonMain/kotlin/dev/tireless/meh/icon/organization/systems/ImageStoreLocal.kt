package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ImageStoreLocal: ImageVector
    get() {
        val current = _imageStoreLocal
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.ImageStoreLocal",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M25 2 v7 h7 V2z m5 5 h-3 V4 h3z
            path(
                strokeLineWidth = 0.0f,
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 25 2
                moveTo(x = 25.0f, y = 2.0f)
                // v 7
                verticalLineToRelative(dy = 7.0f)
                // h 7
                horizontalLineToRelative(dx = 7.0f)
                // V 2z
                verticalLineTo(y = 2.0f)
                close()
                // m 5 5
                moveToRelative(dx = 5.0f, dy = 5.0f)
                // h -3
                horizontalLineToRelative(dx = -3.0f)
                // V 4
                verticalLineTo(y = 4.0f)
                // h 3z
                horizontalLineToRelative(dx = 3.0f)
                close()
            }
            // M23 6 h-7 v12 h12 v-7 h-5z m-2 10 h-3 v-3 h3z m5 -3 v3 h-3 v-3z m-8 -2 V8 h3 v3z
            path(
                strokeLineWidth = 0.0f,
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 23 6
                moveTo(x = 23.0f, y = 6.0f)
                // h -7
                horizontalLineToRelative(dx = -7.0f)
                // v 12
                verticalLineToRelative(dy = 12.0f)
                // h 12
                horizontalLineToRelative(dx = 12.0f)
                // v -7
                verticalLineToRelative(dy = -7.0f)
                // h -5z
                horizontalLineToRelative(dx = -5.0f)
                close()
                // m -2 10
                moveToRelative(dx = -2.0f, dy = 10.0f)
                // h -3
                horizontalLineToRelative(dx = -3.0f)
                // v -3
                verticalLineToRelative(dy = -3.0f)
                // h 3z
                horizontalLineToRelative(dx = 3.0f)
                close()
                // m 5 -3
                moveToRelative(dx = 5.0f, dy = -3.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // h -3
                horizontalLineToRelative(dx = -3.0f)
                // v -3z
                verticalLineToRelative(dy = -3.0f)
                close()
                // m -8 -2
                moveToRelative(dx = -8.0f, dy = -2.0f)
                // V 8
                verticalLineTo(y = 8.0f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // v 3z
                verticalLineToRelative(dy = 3.0f)
                close()
            }
            // M26 20 v2 H6 V8 h8 V6 H6 a2 2 0 0 0 -2 2 v14 a2 2 0 0 0 2 2 h20 a2 2 0 0 0 2 -2 v-2z
            path(
                strokeLineWidth = 0.0f,
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 26 20
                moveTo(x = 26.0f, y = 20.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // H 6
                horizontalLineTo(x = 6.0f)
                // V 8
                verticalLineTo(y = 8.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // V 6
                verticalLineTo(y = 6.0f)
                // H 6
                horizontalLineTo(x = 6.0f)
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
                // v 14
                verticalLineToRelative(dy = 14.0f)
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
                // h 20
                horizontalLineToRelative(dx = 20.0f)
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
                // v -2z
                verticalLineToRelative(dy = -2.0f)
                close()
            }
            // <rect width="28" height="2" x="2.0" y="26.0" fill="#000" stroke-width="0" />
            path(
                fill = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 0.0f,
            ) {
                // M 2 26
                moveTo(x = 2.0f, y = 26.0f)
                // h 28
                horizontalLineToRelative(dx = 28.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -28z
                horizontalLineToRelative(dx = -28.0f)
                close()
            }
            // <rect width="32" height="32" fill="#000" style="fill:none;stroke-width:0" stroke-width="0" />
            path(
                fill = SolidColor(Color.Transparent),
                strokeLineWidth = 0.0f,
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
        }.build().also { _imageStoreLocal = it }
    }

@Suppress("ObjectPropertyName")
private var _imageStoreLocal: ImageVector? = null
