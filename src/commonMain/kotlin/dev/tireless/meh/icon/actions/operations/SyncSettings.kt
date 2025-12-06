package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SyncSettings: ImageVector
    get() {
        val current = _syncSettings
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.SyncSettings",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <polygon points="15.0 24.0 15.0 22.0 11.4 22.0 22.0 11.4 22.0 15.0 24.0 15.0 24.0 8.0 17.0 8.0 17.0 10.0 20.6 10.0 10.0 20.6 10.0 17.0 8.0 17.0 8.0 24.0 15.0 24.0" fill="#000" stroke-width="0" />
            path(
                fill = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 0.0f,
            ) {
                // M 15 24
                moveTo(x = 15.0f, y = 24.0f)
                // L 15 22
                lineTo(x = 15.0f, y = 22.0f)
                // L 11.4 22
                lineTo(x = 11.4f, y = 22.0f)
                // L 22 11.4
                lineTo(x = 22.0f, y = 11.4f)
                // L 22 15
                lineTo(x = 22.0f, y = 15.0f)
                // L 24 15
                lineTo(x = 24.0f, y = 15.0f)
                // L 24 8
                lineTo(x = 24.0f, y = 8.0f)
                // L 17 8
                lineTo(x = 17.0f, y = 8.0f)
                // L 17 10
                lineTo(x = 17.0f, y = 10.0f)
                // L 20.6 10
                lineTo(x = 20.6f, y = 10.0f)
                // L 10 20.6
                lineTo(x = 10.0f, y = 20.6f)
                // L 10 17
                lineTo(x = 10.0f, y = 17.0f)
                // L 8 17
                lineTo(x = 8.0f, y = 17.0f)
                // L 8 24
                lineTo(x = 8.0f, y = 24.0f)
                // L 15 24z
                lineTo(x = 15.0f, y = 24.0f)
                close()
            }
            // M25 20 v2 h3 a2 2 0 0 0 2 -2 v-3 h-2 v3z
            path(
                strokeLineWidth = 0.0f,
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 25 20
                moveTo(x = 25.0f, y = 20.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
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
                // v -3
                verticalLineToRelative(dy = -3.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v 3z
                verticalLineToRelative(dy = 3.0f)
                close()
            }
            // <rect width="2" height="4" x="28.0" y="10.0" fill="#000" stroke-width="0" />
            path(
                fill = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 0.0f,
            ) {
                // M 28 10
                moveTo(x = 28.0f, y = 10.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            // M25 2 v2 h3 v3 h2 V4 a2 2 0 0 0 -2 -2z
            path(
                strokeLineWidth = 0.0f,
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 25 2
                moveTo(x = 25.0f, y = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
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
            // <rect width="4" height="2" x="18.0" y="2.0" fill="#000" stroke-width="0" />
            path(
                fill = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 0.0f,
            ) {
                // M 18 2
                moveTo(x = 18.0f, y = 2.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -4z
                horizontalLineToRelative(dx = -4.0f)
                close()
            }
            // M10 4 v3 h2 V4 h3 V2 h-3 a2 2 0 0 0 -2 2 m2 6 H4 a2 2 0 0 0 -2 2 v16 a2 2 0 0 0 2 2 h16 a2 2 0 0 0 2 -2 v-8 h-2 v8 H4 V12 h8z
            path(
                strokeLineWidth = 0.0f,
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 10 4
                moveTo(x = 10.0f, y = 4.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // V 4
                verticalLineTo(y = 4.0f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // V 2
                verticalLineTo(y = 2.0f)
                // h -3
                horizontalLineToRelative(dx = -3.0f)
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
                // m 2 6
                moveToRelative(dx = 2.0f, dy = 6.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
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
                // v 16
                verticalLineToRelative(dy = 16.0f)
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
                // h 16
                horizontalLineToRelative(dx = 16.0f)
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
                // v -8
                verticalLineToRelative(dy = -8.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v 8
                verticalLineToRelative(dy = 8.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // V 12
                verticalLineTo(y = 12.0f)
                // h 8z
                horizontalLineToRelative(dx = 8.0f)
                close()
            }
            // <rect width="32" height="32" fill="#000" style="fill:none;stroke-width:0" stroke-width="0" />
            path(
                fill = SolidColor(Color.Transparent),
                strokeLineWidth = 0.0f,
            ) {
                // M 32 32
                moveTo(x = 32.0f, y = 32.0f)
                // l -32 0
                lineToRelative(dx = -32.0f, dy = 0.0f)
                // l 0 -32
                lineToRelative(dx = 0.0f, dy = -32.0f)
                // l 32 -0z
                lineToRelative(dx = 32.0f, dy = -0.0f)
                close()
            }
        }.build().also { _syncSettings = it }
    }

@Suppress("ObjectPropertyName")
private var _syncSettings: ImageVector? = null
