package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val QrCode: ImageVector
    get() {
        val current = _qrCode
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.QrCode",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <rect width="2" height="2" x="24.0" y="26.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 23.999998 27.999998
                moveTo(x = 23.999998f, y = 27.999998f)
                // l -8.742278E-8 -2
                lineToRelative(dx = -8.742278E-8f, dy = -2.0f)
                // l 2 -8.742278E-8
                lineToRelative(dx = 2.0f, dy = -8.742278E-8f)
                // l 8.742278E-8 2z
                lineToRelative(dx = 8.742278E-8f, dy = 2.0f)
                close()
            }
            // <rect width="2" height="2" x="18.0" y="22.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 18 23.999998
                moveTo(x = 18.0f, y = 23.999998f)
                // l -8.742278E-8 -2
                lineToRelative(dx = -8.742278E-8f, dy = -2.0f)
                // l 2 -8.742278E-8
                lineToRelative(dx = 2.0f, dy = -8.742278E-8f)
                // l 8.742278E-8 2z
                lineToRelative(dx = 8.742278E-8f, dy = 2.0f)
                close()
            }
            // <polygon points="18.0 30.0 22.0 30.0 22.0 28.0 20.0 28.0 20.0 26.0 18.0 26.0 18.0 30.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 18 30
                moveTo(x = 18.0f, y = 30.0f)
                // L 22 30
                lineTo(x = 22.0f, y = 30.0f)
                // L 22 28
                lineTo(x = 22.0f, y = 28.0f)
                // L 20 28
                lineTo(x = 20.0f, y = 28.0f)
                // L 20 26
                lineTo(x = 20.0f, y = 26.0f)
                // L 18 26
                lineTo(x = 18.0f, y = 26.0f)
                // L 18 30z
                lineTo(x = 18.0f, y = 30.0f)
                close()
            }
            // <rect width="4" height="2" x="25.0" y="23.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 25.999998 25.999998
                moveTo(x = 25.999998f, y = 25.999998f)
                // l -1.7484555E-7 -4
                lineToRelative(dx = -1.7484555E-7f, dy = -4.0f)
                // l 2 -8.742278E-8
                lineToRelative(dx = 2.0f, dy = -8.742278E-8f)
                // l 1.7484555E-7 4z
                lineToRelative(dx = 1.7484555E-7f, dy = 4.0f)
                close()
            }
            // <polygon points="28.0 26.0 30.0 26.0 30.0 30.0 26.0 30.0 26.0 28.0 28.0 28.0 28.0 26.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 28 26
                moveTo(x = 28.0f, y = 26.0f)
                // L 30 26
                lineTo(x = 30.0f, y = 26.0f)
                // L 30 30
                lineTo(x = 30.0f, y = 30.0f)
                // L 26 30
                lineTo(x = 26.0f, y = 30.0f)
                // L 26 28
                lineTo(x = 26.0f, y = 28.0f)
                // L 28 28
                lineTo(x = 28.0f, y = 28.0f)
                // L 28 26z
                lineTo(x = 28.0f, y = 26.0f)
                close()
            }
            // <polygon points="26.0 20.0 26.0 18.0 30.0 18.0 30.0 22.0 28.0 22.0 28.0 20.0 26.0 20.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 26 20
                moveTo(x = 26.0f, y = 20.0f)
                // L 26 18
                lineTo(x = 26.0f, y = 18.0f)
                // L 30 18
                lineTo(x = 30.0f, y = 18.0f)
                // L 30 22
                lineTo(x = 30.0f, y = 22.0f)
                // L 28 22
                lineTo(x = 28.0f, y = 22.0f)
                // L 28 20
                lineTo(x = 28.0f, y = 20.0f)
                // L 26 20z
                lineTo(x = 26.0f, y = 20.0f)
                close()
            }
            // <polygon points="24.0 20.0 22.0 20.0 22.0 24.0 20.0 24.0 20.0 26.0 24.0 26.0 24.0 20.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 24 20
                moveTo(x = 24.0f, y = 20.0f)
                // L 22 20
                lineTo(x = 22.0f, y = 20.0f)
                // L 22 24
                lineTo(x = 22.0f, y = 24.0f)
                // L 20 24
                lineTo(x = 20.0f, y = 24.0f)
                // L 20 26
                lineTo(x = 20.0f, y = 26.0f)
                // L 24 26
                lineTo(x = 24.0f, y = 26.0f)
                // L 24 20z
                lineTo(x = 24.0f, y = 20.0f)
                close()
            }
            // <rect width="2" height="4" x="19.0" y="17.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 18 20
                moveTo(x = 18.0f, y = 20.0f)
                // l -8.742278E-8 -2
                lineToRelative(dx = -8.742278E-8f, dy = -2.0f)
                // l 4 -1.7484555E-7
                lineToRelative(dx = 4.0f, dy = -1.7484555E-7f)
                // l 8.742278E-8 2z
                lineToRelative(dx = 8.742278E-8f, dy = 2.0f)
                close()
            }
            // <rect width="4" height="4" x="6.0" y="22.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 6 22
                moveTo(x = 6.0f, y = 22.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h -4z
                horizontalLineToRelative(dx = -4.0f)
                close()
            }
            // M14 30 H2 V18 h12Z M4 28 h8 v-8 H4Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 14 30
                moveTo(x = 14.0f, y = 30.0f)
                // H 2
                horizontalLineTo(x = 2.0f)
                // V 18
                verticalLineTo(y = 18.0f)
                // h 12z
                horizontalLineToRelative(dx = 12.0f)
                close()
                // M 4 28
                moveTo(x = 4.0f, y = 28.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // v -8
                verticalLineToRelative(dy = -8.0f)
                // H 4z
                horizontalLineTo(x = 4.0f)
                close()
            }
            // <rect width="4" height="4" x="22.0" y="6.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 22 6
                moveTo(x = 22.0f, y = 6.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h -4z
                horizontalLineToRelative(dx = -4.0f)
                close()
            }
            // M30 14 H18 V2 h12Z m-10 -2 h8 V4 h-8Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 30 14
                moveTo(x = 30.0f, y = 14.0f)
                // H 18
                horizontalLineTo(x = 18.0f)
                // V 2
                verticalLineTo(y = 2.0f)
                // h 12z
                horizontalLineToRelative(dx = 12.0f)
                close()
                // m -10 -2
                moveToRelative(dx = -10.0f, dy = -2.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // V 4
                verticalLineTo(y = 4.0f)
                // h -8z
                horizontalLineToRelative(dx = -8.0f)
                close()
            }
            // <rect width="4" height="4" x="6.0" y="6.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 6 6
                moveTo(x = 6.0f, y = 6.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h -4z
                horizontalLineToRelative(dx = -4.0f)
                close()
            }
            // M14 14 H2 V2 h12Z M4 12 h8 V4 H4Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 14 14
                moveTo(x = 14.0f, y = 14.0f)
                // H 2
                horizontalLineTo(x = 2.0f)
                // V 2
                verticalLineTo(y = 2.0f)
                // h 12z
                horizontalLineToRelative(dx = 12.0f)
                close()
                // M 4 12
                moveTo(x = 4.0f, y = 12.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // V 4
                verticalLineTo(y = 4.0f)
                // H 4z
                horizontalLineTo(x = 4.0f)
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
        }.build().also { _qrCode = it }
    }

@Suppress("ObjectPropertyName")
private var _qrCode: ImageVector? = null
